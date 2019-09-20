package com.tree.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * @author zheng
 *
 */
public class LetterCombinations {
	private static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		
		letterCombinations("23");
		System.out.println(list.toString());
	}
	
	public static List<String> letterCombinations(String digits) {
		
		if (digits.equals("")) {
			return new ArrayList<String>();
		}
		String[] letter = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		combinationsString(letter, 0, digits, "");
		return list;
    }
	
	public static void combinationsString(String[] letter,int index,String str,String sb){
		
		if (index == str.length()) {
			list.add(sb);
			return;
		}
		String temp = letter[str.charAt(index)-'0'];
		for (int i = 0; i < temp.length(); i++) {
			combinationsString(letter, index+1, str, sb+ temp.charAt(i));
		}
		return;
	}
	
}
