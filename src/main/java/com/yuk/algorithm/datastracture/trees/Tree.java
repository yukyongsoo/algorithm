package com.yuk.algorithm.datastracture.trees;

import java.util.*;

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

	List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		List<List<Integer>> answer = new ArrayList<>();

		if (root == null)
			return answer;

		q.add(root);
		// Pushing level delimiter into the queue.
		q.add(null);

		List<Integer> list = new ArrayList<>();
		while (!q.isEmpty()) {
			TreeNode curr = q.poll();

			if (curr == null) {
				answer.add(list);
				list = new ArrayList<>();
				if (!q.isEmpty()) {
					q.add(null);
				}
			} else {
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);

				//solution area
				list.add(curr.value);
			}
		}

		return answer;
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
