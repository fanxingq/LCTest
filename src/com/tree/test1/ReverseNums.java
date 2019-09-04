package com.tree.test1;

/**
 * 7. 整数反转
 * @author zheng
 *
 */
public class ReverseNums {

	public static void main(String[] args) {
		int i = reverse(121);
		System.out.println(i);
	}
	public static int reverse(int x) {
       
		int res = 0;
		while (x != 0) {
			int pop = x%10;
			x/= 10;
			if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && pop>7)) {
				return 0;
			}
			if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10  && pop<-8)) {
				return 0;
			}
			res = res*10 + pop;
		}
		return res;
    }
	public static int reverse2(int x) {
		
		long res = 0;
		while (x != 0) {
			int pop = x%10;
			x /= 10;
			res = res*10 + pop;
			if (res >Integer.MAX_VALUE || res<Integer.MIN_VALUE) {
				return 0;
			}
		}
		return (int) res;
	}
}
