package com.tree.test2;

import java.util.Stack;

/**
 * 20. ÓÐÐ§µÄÀ¨ºÅ
 * @author zheng
 *
 */
public class KuoHaoIsValid {

	public static void main(String[] args) {
		String string = "]";
		boolean b = isValid(string);
		System.out.println(b);
	}
	public static boolean isValid(String s) {
        
		Stack<Character> stack = new Stack<>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
				stack.push(c[i]);
			}else if (c[i] == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}else if (c[i] == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else if (c[i] == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}else {
				stack.push(c[i]);
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
	
		return true;	
		
    }
	
	
	
}
