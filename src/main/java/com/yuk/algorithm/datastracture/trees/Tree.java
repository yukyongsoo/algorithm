package com.yuk.algorithm.datastracture.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Tree {
	public int getHeight(TreeNode node) {
		int h = 0;
		if(node != null)
			h = 1 + Math.max(getHeight(node.left), getHeight(node.right));
		return h;
	}
	
	public List<Integer> inOrderIter(TreeNode node){
		List<Integer> list = new ArrayList<>();
		//STACK!!!
		Deque<TreeNode> stack = new ArrayDeque<>();
		TreeNode temp = node;
		while(temp != null || !stack.isEmpty()) {
			while(temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();

			//solution area
			list.add(temp.value);

			temp = temp.right;	
		}
		return list;
	}

	public void orderIterRecursive(TreeNode node){
		if(node != null) {
			//preorder position
			orderIterRecursive(node.left);
			//inorder position
			orderIterRecursive(node.right);
			//postorder position
		}
	}
}
