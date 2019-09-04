package com.tree.test1;

import java.util.ArrayList;
import java.util.Vector;

/**
 * 6. Z ×ÖÐÎ±ä»»
 * @author zheng
 *
 */
public class ZNums {

	public static void main(String[] args) {

		String s = "LEETCODEISHIRING";
		String res = convert2(s, 3);
		System.out.println(res);

	}
	
	public static String convert(String s, int numRows) {
       
		if (numRows == 1) {
			return s;
		}
		int len = Math.min(numRows, s.length());
		String[] rows = new String[len];
		for (int i = 0; i < len; i++) {
			rows[i] = "";
		}
		int index = 0;
		boolean down = false;
		for (int i = 0; i < s.length(); i++) {
			rows[index] = rows[index] + s.substring(i,i+1);
			if (index == 0 || index == numRows - 1) {
				down = !down;
			}
			index = index + (down ? 1 : -1);
		}
		String res = "";
		for (String string : rows) {
			res += string;
		}
		return res;
    }
	public static String convert2(String s, int numRows) {
		
		if (numRows == 1) {
			return s;
		}
		int step = numRows*2-2;
		int index = 0;
		int len = s.length();
		int add = 0;
		String ret = "";
		for (int i = 0; i < numRows; i++) {
			
			index = i;
			add = i*2;
			while (index < len) {
				
				ret += s.substring(index,index+1);
				add = step - add;
				index += (i == 0 || i == numRows-1) ? step : add; 
			}
			
		}
		
		return ret;
	}

}
