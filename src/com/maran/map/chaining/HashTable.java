package com.maran.map.chaining;

public class HashTable {
	
	HashItem[] hashItem;
	
	public HashTable(){
		hashItem = new HashItem[Constants.TABLE_SIZE];
	}
	
	public void put(int key, int value){
		int arrIndex = hash(key);
		
		if(hashItem[arrIndex] == null) {
			System.out.println("Insertion without Collision...");
			hashItem[arrIndex] = new HashItem(key, value);
		} else {
			System.out.println("Collision when inserting with key " + key);
			HashItem hash = hashItem[arrIndex];
			while(hash.getNetHashItem() != null) {
				hash = hash.getNetHashItem();
			}
			hash.setNetHashItem(new HashItem(key, value));
		}
		
	}
	
	public int get(int key){
		int arrIndex = hash(key);
		if(hashItem[arrIndex] == null) {
			return -1;
		} else {
			HashItem hash = hashItem[arrIndex];
			while(hash != null && hash.getKey() != key) {
				hash = hash.getNetHashItem();
			}
			if(hash == null){
				return -1;
			} else {
				return hash.getValue();
			}
		}
	}
	
	private int hash(int key){
		return key % Constants.TABLE_SIZE;
	}

}
