package com.tree.test1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历
 * @author zheng
 *
 */
public class InorderTraversalTest {

	public static void main(String[] args) {

		
	}
	
	//递归,时间复杂度O(n),空间复杂度，最坏O(n)，平均复杂度O(logn)
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> res = new ArrayList<Integer>();
		inorder(root, res);
		
        return res;
    }
	
	public void inorder(TreeNode root,List<Integer> res){
		
		if (root == null) {
			return;
		}
		if (root.left != null) {
			inorder(root.left, res);
		}
		res.add(root.val);
		if (root.right != null) {
			inorder(root.right, res);
		}
		
	}
	
	//非递归，使用栈
	public List<Integer> inorderTraversal2(TreeNode root) {
		
		List<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode curr = root;
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.add(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			res.add(curr.val);
			curr = curr.right;
		}
		
        return res;
    }
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
