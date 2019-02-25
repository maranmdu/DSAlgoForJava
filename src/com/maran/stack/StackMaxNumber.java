package com.maran.stack;

import java.util.Stack;

public class StackMaxNumber {

	private Stack<Integer> mainStack;
	private Stack<Integer> maxStack;

	public StackMaxNumber() {
		mainStack = new Stack<>();
		maxStack = new Stack<>();
	}

	public void push(Integer i) {
		mainStack.push(i);

		if (mainStack.size() == 1) {
			maxStack.push(i);
			return;
		}
		if (i > maxStack.peek()) {
			maxStack.push(i);
		} else {
			maxStack.push(maxStack.peek());
		}
	}

	public Integer pop() {
		maxStack.pop();
		return mainStack.peek();
	}
	
	public Integer getMax(){
		return maxStack.pop();
	}

}
