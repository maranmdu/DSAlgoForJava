package com.maran.queue;

import java.util.Stack;

public class QueueImplWithStack {

	Stack<String> enqueue;
	Stack<String> dequeue;

	public QueueImplWithStack() {
		enqueue = new Stack<>();
		dequeue = new Stack<>();
	}

	public void enqueue(String item) {
		enqueue.push(item);
	}

	public String dequeue() throws Exception {
		if (enqueue.isEmpty() && dequeue.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		if (dequeue.isEmpty()) {
			while (!enqueue.isEmpty()) {
				dequeue.push(enqueue.pop());
			}
		}
		return dequeue.pop();
	}

}
