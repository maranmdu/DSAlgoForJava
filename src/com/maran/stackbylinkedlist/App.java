package com.maran.stackbylinkedlist;

public class App {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
		
	}

}
