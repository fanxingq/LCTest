package com.tree.test1;

import java.util.LinkedList;

import com.lc.utils.ListNode;

/**
 * 21. 合并两个有序链表
 * @author zheng
 * 
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		/*if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}*/
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode pre = new ListNode(0);
		ListNode node = pre;
		while (l1 != null && l2 != null) {
			
			if (l1.val < l2.val) {
				pre.next = l1;
				l1 = l1.next;
			}else {
				pre.next = l2;
				l2 = l2.next;
			}
			pre = pre.next;
		}
		while (l1 != null) {
			pre.next = l1;
			l1 = l1.next;
			pre = pre.next;
		}
		while (l2 != null) {
			pre.next = l2;
			l2 = l2.next;
			pre = pre.next;
		}
		return node.next;
		
    }
	
	
}
