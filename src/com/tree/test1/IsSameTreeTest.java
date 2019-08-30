package com.tree.test1;

import java.util.LinkedList;
import java.util.Queue;

import com.lc.utils.TreeNode;

/**
 * 100. 相同的树
 * @author zheng
 *
 */
public class IsSameTreeTest {

	
	//递归
	public boolean isSameTree(TreeNode p, TreeNode q) {
     
		if (p == null && q == null) {
			return true;
		}else if (p !=null && q != null && p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		
		return false;
    }
	
	// 非递归  超时
	public boolean isSameTree2(TreeNode p, TreeNode q) {
		
		Queue<TreeNode> pNodes = new LinkedList<TreeNode>();
		Queue<TreeNode> qNodes = new LinkedList<TreeNode>();
		pNodes.add(p);
		qNodes.add(q);
		while (!pNodes.isEmpty() && !qNodes.isEmpty()) {
			if (!check(p, q)) {
				return false;
			}
			p = qNodes.peek();
			q = qNodes.peek();
			if (p!=null && q!=null) {
				if (!check(p.left, q.left)) {
					return false;
				}else {
					pNodes.add(p.left);
					qNodes.add(q.left);
				}
				if (!check(p.right, q.right)) {
					return false;
				}else {
					pNodes.add(p.right);
					qNodes.add(q.right);
				}
				
			}
		}
		return true;
	}
	public boolean check(TreeNode p, TreeNode q){
		if (p == null && q == null) {
			return true;
		}
		if (p != null && q != null && p.val == q.val) {
			return true;
		}
		return false;
	}
	
}
 