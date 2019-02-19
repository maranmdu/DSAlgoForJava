package com.maran.bst.impl;

public class BinarySearchTree<T extends Comparable> implements Tree<T> {

	private Node<T> root;

	@Override
	public Node<T> getRoot() {
		return root;
	}

	@Override
	public void insert(T data) {
		if (root == null) {
			root = new Node<T>(data);
		} else {
			insertNode(data, root);
		}
	}

	@Override
	public void traversal() {
		if(root != null){
			inOrder(root);
		}
	}

	@Override
	public T getMaxValue() {
		if (root == null)
			return null;
		return getMax(root);
	}

	@Override
	public T getMinValue() {
		if (root == null)
			return null;
		return getMin(root);
	}

	@Override
	public void delete(T data) {
		if(root != null) {
			root = delete(root, data);
		}
	}

	private Node<T> delete(Node<T> node, T data) {
		if(data.compareTo(node.getData()) < 0) {
			node.setLeft(delete(node.getLeft(), data));
		}else if(data.compareTo(node.getData()) > 0) {
			node.setRight(delete(node.getRight(), data));
		} else {
			if(node.getLeft() == null && node.getRight() == null) {
				return null;
			}
			
			if(node.getLeft() == null ){
				Node tNode = node.getRight();
				node = null;
				return tNode;
			}
			if(node.getRight() == null ){
				Node tNode = node.getLeft();
				node = null;
				return tNode;
			}
		}
		return node;
	}

	private void insertNode(T newData, Node<T> node) {
		if (newData.compareTo(node.getData()) < 0) {
			if (node.getLeft() != null) {
				insertNode(newData, node.getLeft());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setLeft(newNode);
			}
		} else {
			if (node.getRight() != null) {
				insertNode(newData, node.getRight());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setRight(newNode);
			}
		}
	}

	private T getMax(Node<T> node) {
		if (node.getRight() != null) {
			return getMax(node.getRight());
		}
		return node.getData();
	}

	private T getMin(Node<T> node) {
		if (node.getLeft() != null) {
			return getMin(node.getLeft());
		}
		return node.getData();
	}
	
	private void inOrder(Node<T> node){
		if(node == null){
			return;
		}
		inOrder(node.getLeft());
		System.out.println(node.getData());
		inOrder(node.getRight());
	}

	@Override
	public Node getKthSmallest(Node<T> node, int k) {
		int n = size(node.getLeft())+1;
		System.out.println(n);
		if(n == k){
			return node;
		}
		if(n > k){
			return getKthSmallest(node.getLeft(), k);
		}
		if(n < k ){
			return getKthSmallest(node.getRight(), k-n);
		}
		return null;
	}

	@Override
	public int size(Node n) {
		if (n == null) {
			return 0;
		}
		return (size(n.getLeft()) + size(n.getRight())) + 1;
	}

}
