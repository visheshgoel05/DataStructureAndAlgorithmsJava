package com.tree.algorithms;

public class Main {
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(1);
		tree.insert(10);
		tree.insert(21);
		tree.insert(0);
		tree.insert(5);
		tree.insert(7);
		
		tree.inOrderTraversal();
		System.out.println();
		System.out.println(tree.getMin());
		System.out.println(tree.getMax());
		
		tree.delete(10);
		tree.delete(21);
		tree.delete(0);
		tree.delete(1);
		tree.delete(5);
		tree.delete(7);
		
		tree.inOrderTraversal();
		
	
	}

}
