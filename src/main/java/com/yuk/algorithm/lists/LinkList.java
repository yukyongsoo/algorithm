package com.yuk.algorithm.lists;

public class LinkList {
	public ListNode reverseList(ListNode node) {
		ListNode rev = null;
		while(node != null) {
			ListNode next = node.next;
			node.next = rev;
			rev = node;
			node = next;
		}
		return rev;
	}
}
