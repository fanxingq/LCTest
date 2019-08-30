package com.tree.test1;

import com.lc.utils.ListNode;

/**
 * 83. ɾ�����������е��ظ�Ԫ��
 * @author zheng
 *
 */
public class DeleteDuplicatesList {

	 public ListNode deleteDuplicates(ListNode head) {
	        
	    ListNode first = head;
	    
	    while (first != null && first.next != null) {
	    	if (first.val == first.next.val) {  //һֱ�Ƚ�
				first.next = first.next.next;
				first = first.next;
			}else {
				first = first.next;
			}
	    	
		}
		 
	    return head;
		 
	 }
}
