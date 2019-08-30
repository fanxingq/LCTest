package com.tree.test1;

/**
 * ¿ìËÙÅÅĞò
 * @author zheng
 *
 */
public class FastSort {

	public static void main(String[] args) {

		int[] nums = {10,7,2,4};
		
		sort(nums, 0, nums.length-1);
		for (int i : nums) {
			System.out.print(i + " ");
		}
		
	}
	private static void sort(int[] nums, int i, int j) {

		if (i < j) {
			int middle = middleNum(nums, i, j);
			sort(nums, i, middle-1);
			sort(nums, middle+1, j);
		}
		
		
	}
	public static int middleNum(int[] nums,int low,int high){
		
		int temp = nums[low];
		while (low<high) {
			
			while (temp <= nums[high] && low < high) {
				high --;
			}
			nums[low] = nums[high];
			while (temp >= nums[low] && low < high) {
				low ++;
			}
			nums[high] = nums[low];
		}
		nums[low] = temp;
		return low;
		
	}

}
