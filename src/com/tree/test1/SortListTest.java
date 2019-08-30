package com.tree.test1;

import com.lc.utils.ListNode;

/**
 * 148. ≈≈–Ú¡¥±Ì
 * @author zheng
 *
 */
public class SortListTest {

	public ListNode sortList(ListNode head) {
        
		ListNode node = head;
		int count = 1;
		while (node!=null) {
			node = node.next;
			count ++;
		}
		return towSort(head, count);
		
    }
	
	public ListNode towSort(ListNode head,int count){
		
		if (count<=1) {
			return head;
		}
		ListNode first = head;
		for (int i = 0; i < count/2-1; i++) {
			first = first.next;
		}
		ListNode end = first.next;
		//∂œø™
		first.next = null;
		return merge(towSort(head, count/2), towSort(end, count-count/2));
		
	}
	public ListNode merge(ListNode l1,ListNode l2){
		
		ListNode head;
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val<=l2.val) {
			head = l1;
			l1.next = merge(l1.next, l2);
		}else {
			head = l2;
			l2.next = merge(l1, l2.next);
		}
		
		return head;
	}
}
