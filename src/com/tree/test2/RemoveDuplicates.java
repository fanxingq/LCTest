package com.tree.test2;

/**
 * 26. ɾ�����������е��ظ���
 * @author zheng
 *
 */
public class RemoveDuplicates {

	 public int removeDuplicates(int[] nums) {
	   
		 if (nums.length < 1) {
				return 0;
			}
		 int j = 0;
		 for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[j] = nums[i];
			}
		}
		 return j+1;
		 
	    }
	
	
	
}
