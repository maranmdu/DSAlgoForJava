package com.maran.linkedlist;

public class LinkedList<T extends Comparable> implements List<T> {

	Node<T> root;
	int count;

	@Override
	public void insert(T data) {
		count++;
		if (root == null) {
			root = new Node<>(data);
		} else {
			//insertAtBegining(data);
			insertAtEnd(data, root);
		}

	}

	// O(1) constant time
	private void insertAtBegining(T data) {
		Node node = new Node<>(data);
		node.setNext(root);
		root = node;
	}

	// O(N) Linear time 
	//For reference only Not used here
	private void insertAtEnd(T data, Node oldNode) {
		if (oldNode.getNext() == null) {
			Node newNode = new Node(data);
			oldNode.setNext(newNode);
		} else {
			insertAtEnd(data, oldNode.getNext());
		}
	}

	@Override
	public void remove(T data) {
		if (root == null) {
			return;
		}
		count--;
		if (root.getData().compareTo(data) == 0) {
			root = root.getNext();
		} else {
			remove(data, root, root.getNext());
		}
	}

	private void remove(T data, Node<T> prevNode, Node node) {
		while (node != null) {
			if (node.getData().compareTo(data) == 0) {
				prevNode.setNext(node.getNext());
				node = null;
				return;
			}
			prevNode = node;
			node = node.getNext();
		}
	}

	@Override
	public void traverseList() {
		if (root == null)
			return;

		Node<T> node = root;
		while (node != null) {
			System.out.println(node.getData().toString());
			node = node.getNext();
		}
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public Node getMiddleNode() {
		Node<T> firstNode = this.root;
		Node<T> secondNode = this.root;
		while(secondNode.getNext() != null && secondNode.getNext().getNext() != null){
			firstNode = firstNode.getNext();
			secondNode = secondNode.getNext().getNext();
		}
		return firstNode;
	}

	@Override
	public void reverse() {
		Node<T> prev = null;
		Node<T> next = null;
		Node<T> cur = this.root;
		while(cur != null){
			next = cur.getNext();
			cur.setNext(prev);
			prev = cur;
			cur = next;
		}
		this.root = prev;
	}

}
