package com.tree.algorithms;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public void insert(int data) {
		if (data == this.data) {
			return;
		}
		if (data < this.data) {
			if (leftChild == null) {
				leftChild = new TreeNode();
				leftChild.setData(data);
			} else {
				leftChild.insert(data);
			}
		} else {
			if (rightChild == null) {
				rightChild = new TreeNode();
				rightChild.setData(data);
			} else {
				rightChild.insert(data);
			}
		}

	}

	public void inOrderTraversal() {
		if (leftChild != null) {
			leftChild.inOrderTraversal();
		}
		System.out.print(data + ", ");
		if (rightChild != null) {
			rightChild.inOrderTraversal();
		}
	}
	
	public TreeNode get(int value) {
		if(value == data) {
			return this;
		}
		else if(value < data) {
			return leftChild.get(value);
		}
		else {
			return rightChild.get(value);
		}
	}
	
	public int getMin() {
		if(leftChild != null) {
			return leftChild.getMin();
		}
		return data;
	}
	
	public int getMax() {
		if(rightChild != null) {
			return rightChild.getMax();
		}
		return data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

}
