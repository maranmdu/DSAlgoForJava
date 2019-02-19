package com.maran.bst;

import com.maran.bst.impl.BinarySearchTree;
import com.maran.bst.impl.Node;
import com.maran.bst.impl.Tree;

public class App {
	public static void main(String[] args){
		Tree<Integer> t = new BinarySearchTree<>();
		t.insert(34);
		t.insert(2);
		t.insert(54);
		t.insert(11);
		t.insert(45);
		t.insert(22);
		System.out.println(t.getMaxValue());
		System.out.println(t.getMinValue());
		System.out.println("Inorder traversal");
		t.traversal();
//		t.delete(45);
//		System.out.println("Inorder traversal After deleting");
//		t.traversal();
		System.out.println(">>>>>>>>>>>>smallest");
		Node n = t.getKthSmallest(t.getRoot(), 5);
		System.out.println(">>>>>>>>>>" + n.getData().toString());
	}
}
