package com.tree.test1;

import java.util.HashMap;
import java.util.Map;

import com.lc.utils.TreeNode;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * @author zheng
 *
 */
public class BuildTreeTest {

	int pre_index = 0;
	int[] preorder;
	int[] inorder;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
    
		this.inorder = inorder;
		this.preorder = preorder;
		int i = 0;
		for (Integer j : inorder) {
			map.put(j, i++);
		}
		
		return build(0, inorder.length-1);
		
    }
	public TreeNode build(int inleft,int inright){
		
		if (inleft > inright) {
			return null;
		}
		int root_index = preorder[pre_index];
		TreeNode root = new TreeNode(root_index);
		int index = map.get(root_index);
		pre_index ++;
		root.left = build(inleft, index-1);
		root.right = build(index+1, inright);
		return root;
	}
	
}
