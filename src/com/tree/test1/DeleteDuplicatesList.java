package com.tree.test1;

import com.lc.utils.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 * @author zheng
 *
 */
public class DeleteDuplicatesList {

	 public ListNode deleteDuplicates(ListNode head) {
	        
	    ListNode first = head;
	    
	    while (first != null && first.next != null) {
	    	if (first.val == first.next.val) {  //一直比较
				first.next = first.next.next;
				first = first.next;
			}else {
				first = first.next;
			}
	    	
		}
		 
	    return head;
		 
	 }
}
