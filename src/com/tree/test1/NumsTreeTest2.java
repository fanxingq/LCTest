package com.tree.test1;

import java.util.LinkedList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II
 * 
 * @author zheng
 *
 */
public class NumsTreeTest2 {

	//递归
	public List<TreeNode> generateTrees(int n) {
        
		if (n == 0) {
			return new LinkedList<TreeNode>();
		}
		return generate(1, n);
    }
	
	public LinkedList<TreeNode> generate(int start,int end){
		
		LinkedList<TreeNode> alltrees = new LinkedList<TreeNode>();
		if (start>end) {
			alltrees.add(null);
			return alltrees;
		}
		for (int i = start; i <= end; i++) {
			LinkedList<TreeNode> leftList = generate(start, i-1);
			LinkedList<TreeNode> rightList = generate(i+1, end);
			for (TreeNode l : leftList) {
				for (TreeNode r : rightList) {
					TreeNode currNode = new TreeNode(i);
					currNode.left = l;
					currNode.right = r;
					alltrees.add(currNode);
				}
			}
			
		}
		return alltrees;
		
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
