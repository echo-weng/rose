package org.rose.webservice.support;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.LinkedList;

/**
 * MultiThreadManager can be used to execute a list Runnable instances
 *
 * The default intercurrent threads are 20.
 * @author YangYang
 * @version 0.1, 2007-8-3 10:12:10
 * @see Runnable
 */
public class MultiThreadManager {
	private static transient Log log = LogFactory.getLog(MultiThreadManager.class);

	private static final int DEFAULT_MAX_INTERCURRENT = 20;

	public static final String STATE_READY = "ready";
	public static final String STATE_EXECUTING = "executing";
	public static final String STATE_ALL_STARTED = "allStarted";

	private int maxIntercurrent;

	private int currentCount;

	LinkedList<Runnable> runnables;

	private String state;

	public MultiThreadManager() {
		this(null);
	}

	public MultiThreadManager(Integer maxIntercurrent) {
		if (maxIntercurrent == null || maxIntercurrent < 1) {
			maxIntercurrent = DEFAULT_MAX_INTERCURRENT;
		}
		if (log.isDebugEnabled()) {
			log.debug("max intercurrent -> " + DEFAULT_MAX_INTERCURRENT);
		}
		this.maxIntercurrent = maxIntercurrent;
		currentCount = 0;
		runnables = new LinkedList<Runnable>();
		state = STATE_READY;
	}

	public void addRunnable(Runnable runnable) {
		if (STATE_READY.equals(state)) {
			runnables.add(runnable);
		} else {
			throw new IllegalStateException("MultiThreadManager is [" + state + "], can not add Runnable");
		}
	}

	public synchronized void execute() {
		if (runnables.size() < 1) {
			if (log.isDebugEnabled()) {
				log.debug("No [Runnable] instance need to be start");
			}
			return;
		}

		if (!STATE_READY.equals(state)) {
			throw new IllegalStateException("MultiThreadManager is [" + state + "],  not [" + STATE_READY + "]");
		}

		state = STATE_EXECUTING;
		if (log.isInfoEnabled()) {
			log.info("MultiThreadManager Start [" + runnables.size() + "] runnable instances");
		}

		int runnableSize = runnables.size();
		for (int i = 0; i < runnableSize; i++) {
			Runnable runnable = runnables.removeFirst();
			try {
				synchronized (this) {
					while (!startRunnable(runnable)) {
						this.wait();
					}
				}
			} catch (InterruptedException e) {
				if (log.isDebugEnabled()) {
					log.debug("Start [Runnable] instance fail", e);
				}
			}
		}

		try {
			synchronized (this) {
				while (currentCount > 0) {
					this.wait();
				}
			}
		} catch (InterruptedException e) {
			if (log.isDebugEnabled()) {
				log.debug("MultiThreadManager wait fail", e);
			}
		}

		if (log.isInfoEnabled()) {
			log.info("MultiThreadManager finish runnable instances");
		}
		state = STATE_READY;
	}

	private boolean startRunnable(Runnable runnable) throws InterruptedException {
		if (currentCount < maxIntercurrent) {
			Thread thread = new InnerThread(runnable, this);
			thread.start();
			currentCount++;
			return true;
		} else {
			return false;
		}
	}

	private void releaseRunnable() {
		currentCount--;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isReady() {
		return STATE_READY.equals(state);
	}

	class InnerThread extends Thread {
		private MultiThreadManager manager;

		public InnerThread(Runnable target, MultiThreadManager manager) {
			super(target);
			this.manager = manager;
		}

		public void run() {
			if (log.isDebugEnabled()) {
				log.debug("One Runnable instance is running");
			}

			try {
				super.run();
			} catch (Exception e) {
				log.error("Catched exception", e);
			} finally {
				if (log.isDebugEnabled()) {
					log.debug("Finish");
				}
				synchronized (manager) {
					manager.releaseRunnable();
					manager.notify();
				}
			}
		}
	}
}
