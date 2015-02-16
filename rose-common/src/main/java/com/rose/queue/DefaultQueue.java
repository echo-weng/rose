package com.rose.queue;

import java.util.concurrent.LinkedBlockingQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 默认queue实现
 *
 * @author echo
 */
public class DefaultQueue<T> implements RoseQueue<T>{
	
	private final Log LOG = LogFactory.getLog(this.getClass());
	
	private LinkedBlockingQueue<T> blockingQueue;
	
	public DefaultQueue(LinkedBlockingQueue<T> blockingQueue){
		this.blockingQueue = blockingQueue;
	}
	
	public void enQueue(T t) {
		try {
			blockingQueue.put(t);
		} catch (InterruptedException e) {
			LOG.error("en queue error", e);
		}
	}

	public T deQueue() {
		try {
			return blockingQueue.take();
		} catch (InterruptedException e) {
			LOG.error("en queue error", e);
		}
		return null;
	}
	
}
