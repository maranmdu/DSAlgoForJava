package com.maran.bst.impl;

public interface Tree<T> {
	public void traversal();

	public void insert(T data);
	
	public void delete(T data);
	
	public T getMaxValue();
	
	public T getMinValue();
	
	public Node getRoot();
	
	public Node getKthSmallest(Node<T> node, int k);
	
	public int size(Node n);
}
