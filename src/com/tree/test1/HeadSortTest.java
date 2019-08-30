package com.tree.test1;

/**
 * 堆排序
 * @author zheng
 *
 */
public class HeadSortTest {

	public static void main(String[] args) {

		int[] nums = {10,7,2,4};
		heapSort(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}
		
	}

	public static void heapSort(int[] nums){
		
		//构造初始堆
		for (int i = (nums.length)/2-1; i>=0; i--) {
			 headAdjust(nums, nums.length, i);
		}
		//排序，将最大的节点放在堆尾，然后从根节点重新调整
        for (int i = nums.length - 1; i >= 1; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            headAdjust(nums, i, 0);
        }
	}
	
	//堆调整
	private static void headAdjust(int[] list, int len, int i) {
        int k = i, temp = list[i], index = 2 * k + 1;
        while (index < len) {
            if (index + 1 < len) {
                if (list[index] < list[index + 1]) {
                    index = index + 1;
                }
            }
            if (list[index] > temp) {
                list[k] = list[index];
                k = index;
                index = 2 * k + 1;
            } else {
                break;
            }
        }
        list[k] = temp;
    }
	
}
