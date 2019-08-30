package com.tree.test1;

import java.util.LinkedList;
import java.util.Queue;

import com.lc.utils.TreeNode;

public class MaxDepthTreeTest {

	//广度优先搜索遍历
	/*public int maxDepth(TreeNode root) {
		
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int res = 0;
		int count = queue.size();
		while (!queue.isEmpty()) {
			while (count>0) {
				TreeNode node = queue.poll();
				if (node.left!=null) {
					queue.add(node.left);
				}
				if (node.right!=null) {
					queue.add(node.right);
				}
				count --;
			}
			count = queue.size();
			res ++;
		}
		return res;
    }*/
	public int maxDepth(TreeNode root) {
		
		if (root == null) {
			return 0;
		}
		int leftlen = maxDepth(root.left);
		int rightlen = maxDepth(root.right);
		return Math.max(leftlen, rightlen);
	}
}
