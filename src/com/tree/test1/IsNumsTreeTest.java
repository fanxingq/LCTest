package com.tree.test1;

import java.util.LinkedList;

/**
 * 98. 验证二叉搜索树
 * 
 * 记录上下界
 * 
 * @author zheng
 *
 */
public class IsNumsTreeTest {

	/*public boolean isValidBST(TreeNode root) {

		return helper(root, null, null);
    }
	
	//
	public boolean helper(TreeNode root, Integer up, Integer low){
		if (root == null) {
			return true;
		}
		int temp = root.val;
		if (low!=null && low >= temp) {
			return false;
		}
		if (up!=null && temp >= up) {
			return false;
		}
		//注意上下界
		if (!helper(root.left, temp, low)) {
			return false;
		}
		if (!helper(root.right, up, temp)) {
			return false;
		}
		return true;
	}*/
	
	//迭代，深度优先
	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
	LinkedList<Integer> lowerList = new LinkedList<Integer>();
	LinkedList<Integer> upperList = new LinkedList<Integer>();
	
	public boolean isValidBST(TreeNode root) {

		Integer lower = null,upper = null,val;
		update(root, lower, upper);
		
		while (!stack.isEmpty()) {
			root = stack.poll();
			lower = lowerList.poll();
			upper = upperList.poll();
			if (root == null) continue;
			val = root.val;
			if (lower!=null && val <= lower) {
				return false;
			}
			if (upper!=null && val >= upper) {
				return false;
			}
			update(root.left, lower, val);
			update(root.right, val, upper);
		}
		
		return true;
		
	}
	
	public void update(TreeNode node, Integer lower,Integer upper){
		
		stack.add(node);
		lowerList.add(lower);
		upperList.add(upper);
		
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
