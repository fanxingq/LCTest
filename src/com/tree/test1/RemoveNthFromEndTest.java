package com.tree.test1;

import com.lc.utils.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 * @author zheng
 *
 */
public class RemoveNthFromEndTest {

	public ListNode removeNthFromEnd(ListNode head, int n) {
        
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode node = dummy;
		int i = 1;
//		while (i<=n+1) {
//			node = node.next;
//			i++;
//		}
		for (int j = 1; j <= n+1; j++) {
			node = node.next;
		}
		ListNode pre = dummy;
		while (node!=null) {
			node = node.next;
			pre = pre.next;
		}
		
		ListNode prenext = pre.next.next;
		pre.next = prenext;
		
		return head;
    }
}
