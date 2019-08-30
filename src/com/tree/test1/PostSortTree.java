package com.tree.test1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.lc.utils.TreeNode;

/**
 * 145. 二叉树的后序遍历
 * @author zheng
 *
 */
public class PostSortTree {

	List<Integer> list = new ArrayList<Integer>();
	 public List<Integer> postorderTraversal(TreeNode root) {
	        
		 if (root == null) {
			return new ArrayList<Integer>();
		}
//		 postSort(root);
		 LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		 LinkedList<Integer> res = new LinkedList<Integer>();
		 stack.add(root);
		 while (!stack.isEmpty()) {
			TreeNode node = stack.pollLast();
			res.addFirst(node.val);
			if (node.left != null) {
				stack.add(node.left);
			}
			if (node.right != null) {
				stack.add(node.right);
			}
		}
		 
		 
		 return res;
	    
	 }
	 public void postSort(TreeNode root){
		 
		 if (root == null) {
			return;
		}
		 if (root.left != null) {
			postSort(root.left);
		}
		 if (root.right != null) {
			postSort(root.right);
		}
		 list.add(root.val);
		 
	 }
	
}
