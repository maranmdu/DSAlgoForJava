package com.maran.stackbyArrays;

public class Stack<T> {
	public T[] stack;
	public int numOfItems;
	
	public Stack(){
		this.stack = (T[]) new Object[1];
	}
	
	public boolean isEmpty(){
		return numOfItems == 0;
	}
	
	public void push(T newData){
		if(numOfItems == this.stack.length){
			reSize(2 * this.stack.length);
		}
		this.stack[numOfItems++] = newData;
	}
	
	public T peek(){
		return this.stack[numOfItems-1];
	}
	
	public T pop(){
		T itemToPop = this.stack[--numOfItems];
		this.stack[numOfItems] = null;
		if(numOfItems > 0 && numOfItems == this.stack.length / 4) {
			reSize(this.stack.length/2);
		}
		return itemToPop;
	}

	private void reSize(int n) {
		T[] copy = (T[]) new Object[n];
		for(int i=0; i < this.numOfItems ; i++){
			copy[i] = this.stack[i];
		}
		this.stack = copy;
	}
	
	public int size(){
		return this.numOfItems;
	}
	
}
