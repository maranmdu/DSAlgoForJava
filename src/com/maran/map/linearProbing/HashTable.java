package com.maran.map.linearProbing;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class HashTable {

	private HashItem[] item;

	public HashTable() {
		item = new HashItem[Constants.TABLE_SIZE];
	}

	public void put(int key, int value) {
		int arrIndex = hash(key);
		System.out.println("Index is : " + arrIndex);
		while (item[arrIndex] != null) {
			arrIndex = (arrIndex + 1) % Constants.TABLE_SIZE;
			System.out.println("Generating new Hash..");
		}
		item[arrIndex] = new HashItem(key, value);
	}

	public int get(int key) {
		int arrIndex = hash(key);
		while (item[arrIndex] != null && item[arrIndex].getKey() != key) {
			arrIndex = (arrIndex + 1) % Constants.TABLE_SIZE;
		}
		if (item[arrIndex] == null) {
			return -1;
		} else {
			return item[arrIndex].getValue();
		}
	}

	private int hash(int key) {
		return key % Constants.TABLE_SIZE;
	}

}
