package com.maran.linkedlist;

public class App2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.insert("Madurai");
		list.insert("Tiruchi");
		list.insert("Nellai");
		list.insert("ambai");
		list.insert("Papanasam");
		list.insert("pothigai");
		list.insert("Kalakadu");
		list.insert("vaigai");
		list.insert("kaveri");
		list.insert("gangai");
		//System.out.println(list.getMiddleNode());
		list.traverseList();
		list.reverse();
		System.out.println("after reversing....");
		list.traverseList();

	}
}
