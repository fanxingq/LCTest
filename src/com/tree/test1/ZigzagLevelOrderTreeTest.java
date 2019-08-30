package com.tree.test1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.lc.utils.TreeNode;

/**
 * 103. �������ľ���β�α���
 * @author zheng
 *
 */
public class ZigzagLevelOrderTreeTest {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
		if (root == null) {
			return new ArrayList<List<Integer>>();
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int count = queue.size();
		boolean isReverse = false;  //��¼�Ƿ�ת
		while (!queue.isEmpty()) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			while (count>0) {
				TreeNode node = queue.poll();
				if (!isReverse) {
					list.add(node.val);
				}else {
					list.addFirst(node.val);
				}
				if (node.left!=null) {
					queue.add(node.left);
				}
				if (node.right!=null) {
					queue.add(node.right);
				}
				count--;
			}
			count = queue.size();
			isReverse = !isReverse;
			res.add(list);
		}
		return res;
		
    }
}
