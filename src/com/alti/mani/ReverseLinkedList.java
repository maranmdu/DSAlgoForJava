package com.alti.mani;

public class ReverseLinkedList {

	static Node head;

	static class Node {

		String data;
		Node next;

		Node(String d) {
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}
	
	void printRecRev(Node head){
		if(head != null){
			printRecRev(head.next);
			System.out.println(head.data);
		}
	}


	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node("mani");
		list.head.next = new Node("Maran");
		list.head.next.next = new Node("kaviya");
		list.head.next.next.next = new Node("bhavana");
		list.printList(list.head);
		list.head = list.reverse(list.head);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		list.printList(list.head);
		System.out.println(">>>>>>>>>>>>>>>>>>");
		list.printRecRev(list.head);
	}

	
}
