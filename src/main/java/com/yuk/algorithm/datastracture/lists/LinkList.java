package com.yuk.algorithm.datastracture.lists;

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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode left = head;
		ListNode right = head;
		while(n -- > 0) {
			right = right.next;
		}

		if(right == null) return head.next;

		while(right.next != null) {
			left = left.next;
			right = right.next;
		}
		left.next = left.next.next;
		return head;
	}
}
