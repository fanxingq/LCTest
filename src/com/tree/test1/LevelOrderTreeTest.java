package com.tree.test1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.lc.utils.TreeNode;

/**
 * 102. 二叉树的层次遍历
 * @author zheng
 * 
 * 使用队列
 */
public class LevelOrderTreeTest {

	public List<List<Integer>> levelOrder(TreeNode root) {
        
		if (root == null) {
			return new ArrayList<List<Integer>>();
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int count = queue.size();
		while (!queue.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			
			while (count>0) {
				TreeNode node = queue.poll();
				if (node.left!=null) {
					queue.add(node.left);
				}
				if (node.right!=null) {
					queue.add(node.right);
				}
				list.add(node.val);
				count--;
			}
			res.add(list);
			count = queue.size();
			
		}
		return res;
    }
	
	
	
	
}
