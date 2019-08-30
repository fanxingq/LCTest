package com.tree.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.lc.utils.TreeNode;

/**
 * 144. 二叉树的前序遍历
 * @author zheng
 *
 */
public class PreSortTree {

	List<Integer> list = new ArrayList<Integer>();
	public List<Integer> preorderTraversal(TreeNode root) {
        
//		preSort(root);
		if (root == null) {
			return new ArrayList<Integer>();
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			list.add(node.val);
			if (node.right != null) {
				stack.add(node.right);
			}
			if (node.left != null) {
				stack.add(node.left);
			}
		}
		return list;
    }
	public void preSort(TreeNode root){
		
		if (root == null) {
			return;
		}
		list.add(root.val);
		if (root.left != null) {
			preSort(root.left);
		}
		if (root.right != null) {
			preSort(root.right);
		}
	}
	
}
