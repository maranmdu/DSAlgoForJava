package com.maran.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.maran.bst.impl.BinarySearchTree;
import com.maran.bst.impl.Node;
import com.maran.bst.impl.Tree;

public class BstCompare {
	
	public static void main(String s[]){
		BstCompare bst = new BstCompare();
		Tree<Integer> t1 = bst.getBst();
		Tree<Integer> t2 = bst.getBst2();
		//System.out.println(bstCompare(t1,t2));
		t1.traversal();
		t2.traversal();
		System.out.println(compareBst(t1.getRoot(),t2.getRoot()));
	}
	
	//Compare method
	
	public static boolean compareBst(Node<Integer> node1, Node<Integer> node2){
		if(node1 == null || node2 == null){
			return node1 == node2;
		}
		if(node1.getData().compareTo(node2.getData()) != 0){
			return false;
		}
		return compareBst(node1.getLeft(), node2.getLeft()) && compareBst(node1.getRight(), node2.getRight()); 
	}
	
	
	
	private static boolean bstCompare(Tree<Integer> t1, Tree<Integer> t2) {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		l1 = getInOrder(t1.getRoot(), l1);
		System.out.println(l1);
		l2 = getInOrder(t2.getRoot(), l2);
		System.out.println(l2);
		return Arrays.equals(l1.toArray(), l2.toArray());
	}

	private static List<Integer> getInOrder(Node<Integer> node, List<Integer> list) {
		if(node != null){
			getInOrder(node.getLeft(), list);
			list.add(node.getData());
			System.out.println("Inside : " + list);
			getInOrder(node.getRight(), list);
		}
		return list;
	}

	private Tree<Integer> getBst(){
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(44);
		bst.insert(11);
		bst.insert(22);
		bst.insert(55);
		bst.insert(33);
		bst.insert(66);
		bst.insert(77);
		return bst;
	}
	
	private Tree<Integer> getBst2(){
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(55);
		bst.insert(44);
		bst.insert(11);
		bst.insert(22);
		bst.insert(33);
		bst.insert(66);
		bst.insert(77);
		return bst;
	}
}
