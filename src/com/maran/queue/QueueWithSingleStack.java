package com.maran.queue;

import java.util.Stack;

public class QueueWithSingleStack {
	private Stack<String> st;
	
	public QueueWithSingleStack(){
		st = new Stack<>();
	}
	
	public void enqueue(String item){
		st.push(item);
	}
	
	public String dequeue(){
		if(st.isEmpty()) {
			return null;
		}
		if(st.size() == 1) {
			return st.pop();
		}
		
		String item = st.pop();
		String lastItem = dequeue();
		enqueue(item);
		return lastItem;
	}
}
