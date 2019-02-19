package com.maran.stackbylinkedlist;

public class Stack<T extends Comparable> {
	private Node<T> root;
	private int count;
	
	public int size(){
		return this.count;
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public void push(T data){
		this.count++;
		if(root  == null){
			root = new Node<>(data);
		}else{
			Node<T> old = this.root;
			this.root = new Node<>(data);
			this.root.setNext(old);
		}
	}
	
	public T peek(){
		return this.root.getData();
	}
	
	public T pop(){
		T itemToPopulate = this.root.getData();
		this.root = this.root.getNext();
		count--;
		return itemToPopulate;
	}

}
