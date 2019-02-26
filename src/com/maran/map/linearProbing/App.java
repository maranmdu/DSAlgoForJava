package com.maran.map.linearProbing;

public class App {

	public static void main(String[] args) {
		HashTable table = new HashTable();
		table.put(1, 101);
		table.put(11, 1001);
		table.put(3, 102);
		
		System.out.println(table.get(1));
		System.out.println(table.get(11));
		System.out.println(table.get(3));
		
	}

}
