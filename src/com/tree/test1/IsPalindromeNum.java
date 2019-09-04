package com.tree.test1;

import java.util.Stack;

/**
 * 9. »ØÎÄÊý
 * @author zheng
 *
 */
public class IsPalindromeNum {
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(-121));
		System.out.println("".length());
		
	}
	public static boolean isPalindrome(int x) {
		
//		char[] arr = String.valueOf(x).toCharArray();
//		StringBuffer sb = new StringBuffer(x);
//		StringBuffer sbnew = new StringBuffer();
//		Stack<Character> stack = new Stack<Character>();
//		int i = 0;
//		while (i < arr.length) {
//			stack.add(arr[i]);
//			i++;
//		}
//		int j = 0;
//		while (j<arr.length) {
//			sbnew.append(arr[j]);
//		}
//		if (sb.equals(sbnew)) {
//			return true;
//		}
//		return false;
		if (x < 0) {
			return false;
		}
		long res = 0;
		int n = x;
		while (x != 0) {
			int pop = x%10;
			x /= 10;
			res = res*10 + pop;
			if (res >Integer.MAX_VALUE || res<Integer.MIN_VALUE) {
				return false;
			}
		}
		if ((int)res == n) {
			return true;
		}
		return false;
    }
}
