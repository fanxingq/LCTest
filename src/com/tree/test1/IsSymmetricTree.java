package com.tree.test1;

import java.util.LinkedList;
import java.util.Queue;

import com.lc.utils.TreeNode;

/**
 * 101. ¶Ô³Æ¶þ²æÊ÷
 * @author zheng
 *
 */
public class IsSymmetricTree {

	/*public boolean isSymmetric(TreeNode root) {
		
		if (root == null) {
			return true;
		}

		if (root.left == null && root.right == null) {
			return true;
		}
		if (root.left != null && root.right != null && root.left.val == root.right.val) {
			return check(root.left, root.right);
		}
		
		return false;
	}
	
	public boolean check(TreeNode leftNode,TreeNode rightNode){
		
		if (leftNode == null && rightNode == null) {
			return true;
		}
		if (leftNode == null || rightNode == null) {
			return false;
		}
			return check(leftNode.left, rightNode.right) && check(leftNode.right, rightNode.left) && (leftNode.val == rightNode.val);
	}*/
	
	public boolean isSymmetric(TreeNode root) {
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode l = queue.poll();
			TreeNode r = queue.poll();
			if (l == null && r == null) {
				continue;
			}
			if (l == null || r == null) {
				return false;
			}
			if (l.val != r.val) {
				return false;
			}
			queue.add(l.left);
			queue.add(r.right);
			queue.add(l.right);
			queue.add(r.left);
			
		}
		
		
		return true;
	}
	
}
