package com.tree.algorithms;


public class Tree {
	private TreeNode root;

	public void insert(int data) {
		if (root == null) {
			root = new TreeNode();
		}
		root.insert(data);
	}

	public void inOrderTraversal() {
		if (root == null) {
			return;
		}
		root.inOrderTraversal();
	}

	public int getMin() {
		if (root == null) {
			return -1;
		} else {
			return root.getMin();
		}
	}

	public int getMax() {
		if (root == null) {
			return -1;
		} else {
			return root.getMax();
		}
	}
	
	
	public void delete(int value) {
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subtreeroot, int value) {
		if(subtreeroot == null) {
			return subtreeroot;
		}
		else if(value <  subtreeroot.getData()) {
			subtreeroot.setLeftChild(delete(subtreeroot.getLeftChild(), value));
		}
		else if(value > subtreeroot.getData()) {
			subtreeroot.setRightChild(delete(subtreeroot.getRightChild(), value));
		}
		else {
			// Cases 1 and 2: node to delete has 0 or 1 child(ren)
			if(subtreeroot.getLeftChild() == null) {
				return subtreeroot.getRightChild();
			}
			else if(subtreeroot.getRightChild() == null) {
				return subtreeroot.getLeftChild();
			}
			else {
				// Case 3: node to delete has 2 children

	            // Replace the value in the subtreeRoot node with the smallest value
	            // from the right subtree
				subtreeroot.setData(subtreeroot.getRightChild().getMin());
				// Delete the node that has the smallest value in the right subtree
				subtreeroot.setRightChild(delete(subtreeroot.getRightChild(), subtreeroot.getData()));
			}
		}
		return subtreeroot;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

}
