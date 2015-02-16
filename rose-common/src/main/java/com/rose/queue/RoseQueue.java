package com.rose.queue;

/**
 * queue
 *
 * @author echo
 */
public interface RoseQueue<T> {
	
	void enQueue(T e);
	
	T deQueue();
	
}
