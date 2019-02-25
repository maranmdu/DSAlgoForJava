package com.maran.linkedlist;

public class LInkedListApp {

	public static void main(String[] args) {
		List<Integer> myList = new LinkedList<>();
		myList.insert(10);
		myList.insert(23);
		myList.insert(18);
		myList.insert(66);
		
		System.out.println(myList.size());
		myList.traverseList();
		
		myList.remove(18);
		myList.traverseList();
	}

}
