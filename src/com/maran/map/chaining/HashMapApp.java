package com.maran.map.chaining;

public class HashMapApp {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		hashTable.put(11, 101);
		hashTable.put(22, 102);
		hashTable.put(33, 103);
		hashTable.put(11, 104);
		hashTable.put(55, 105);
		
		System.out.println(hashTable.get(22));
		System.out.println(hashTable.get(33));
		System.out.println(hashTable.get(55));
		System.out.println(hashTable.get(11));
		System.out.println(hashTable.get(11));
		
		
		
	}

}
