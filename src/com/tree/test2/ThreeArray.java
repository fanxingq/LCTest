package com.tree.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * @author zheng
 *
 */
public class ThreeArray {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> list = threeSum(nums);
		
	}
	public static List<List<Integer>> threeSum(int[] nums) {
     
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		if (nums == null || nums.length < 3) {
			return list;
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) break; 
            if(i > 0 && nums[i] == nums[i-1]) continue; 
            int left = i + 1;
    		int right = nums.length-1;
            while (left < right) {
    			int sum = nums[i] + nums[left] + nums[right];
    			List<Integer> l = new ArrayList<Integer>();
    			if (sum == 0) {
    				l.add(nums[i]);
    				l.add(nums[left]);
    				l.add(nums[right]);
    				list.add(l);
    				while (left < right && nums[left] == nums[left+1]) {
    					left++;
    				}
    				while (left < right && nums[right] == nums[right-1]) {
    					right--;
    				}
    				left++;
    				right--;
    			}else if (sum > 0) {
    				right--;
    			}else if (sum < 0) {
    				left++;
    			}
    		}
		}
		
		return list;
		
    }
	
}
