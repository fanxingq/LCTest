package com.tree.test2;

import com.lc.utils.ListNode;

/**
 * 24. 两两交换链表中的节点
 * @author zheng
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class SwapPairsList {

	public ListNode swapPairs(ListNode head) {
        
		if (head == null || head.next == null) {
			return head;
		}
		ListNode next = head.next;
		head.next = swapPairs(next.next);
		next.next = head;
		
		return next;
	}
	public ListNode swapPairs2(ListNode head) {
        
		ListNode pre = new ListNode(-1);
		pre.next = head;
		ListNode temp = pre;
		while (temp.next != null && temp.next.next != null) {
			
			ListNode next = temp.next;
			ListNode hnext = temp.next.next;
			temp.next = hnext;
			next.next = hnext.next;
			hnext.next = next;
			temp = next;
		}
		
		return pre.next;
	}
}
