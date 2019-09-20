package com.tree.test2;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * @author zheng
 *
 */
public class ThreeSumClosest {

	public static void main(String[] args) {
		
		int[] nums = {-1,2,1,-4};
		int res = threeSumClosest(nums, 1);
		System.out.println(res);
		
	}
	public static int threeSumClosest(int[] nums, int target) {
       
		Arrays.sort(nums);
		int res = Integer.MAX_VALUE;
		int r = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums.length < 3) {
				return 0;
			}
			int left = i+1;
			int right = nums.length-1;
			while (i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				int temp = Math.abs(sum - target);
				if (temp < res) {
					res = temp;
					r = sum;
//					while (left < right && nums[right] == nums[right-1]) {
//						right --;
//					}
//					while (left < right && nums[left] == nums[left+1]) {
//						left ++;
//					}
					right --;
					left ++;
				}else if (sum < target) {
					left ++;
				}else if (sum > target) {
					right --;
				}
				
			}
		}
		
		return r;
    }
}
