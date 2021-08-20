package com.yuk.algorithm.datastracture.lists;

public class LinkList {
    public ListNode reverseList(ListNode node) {
        ListNode rev = null;
        while (node != null) {
            ListNode next = node.next;
            // 핵심
            node.next = rev;
            rev = node;
            node = next;
        }
        return rev;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;
        while (n-- > 0) {
            right = right.next;
        }

        if (right == null) return head.next;

        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(1);
        // 이 노드는 항상 마지막 이동 장소를 기억하고 있다!!
        ListNode node = answer;
        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                node.next = l1;
                node = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                node = l2;
                l2 = l2.next;
            }
        }
        node.next = l1 != null ? l1 : l2;

        return answer.next;
    }
}
