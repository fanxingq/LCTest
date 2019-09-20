package com.tree.test2;

/**
 * 88. 合并两个有序数组
 * 
 * @author zheng
 *
 */
public class MergeArray {

	public static void main(String[] args) {

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int k = n+m-1, i = m - 1, j = n - 1;
		while (k >= 0 && j > 0 && i > 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i --;
			} else {
				nums1[k] = nums2[j];
				j --;
			}
			k--;
		}
		System.arraycopy(nums2, 0, nums1, 0, j+1);
	}

}
