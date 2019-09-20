package com.tree.test1;

import java.util.HashMap;
import java.util.Map;

import com.lc.utils.TreeNode;

/**
 * 
 * @author zheng
 *
 */
public class BuildTree2 {

	int[] inorder;
	int[] postorder;
	int post_index;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
		 this.postorder = postorder;
         post_index = postorder.length-1;
		 int j = 0;
		 for (Integer i : inorder) {
			map.put(i, j++);
		}
		 
		 return build(0, inorder.length-1);
    }
     public TreeNode build(int in_left,int in_right){
		 
		  TreeNode root = null;
		 if (in_left > in_right) {
			return null;
		}
		 if (post_index>=0) {
			 int root_po = postorder[post_index];
			 root = new TreeNode(root_po);
			 post_index --;
			 int index = map.get(root_po);
			 root.right = build(index+1, in_right);
			 root.left = build(in_left, index-1);
		}
		 return root;
	 }
}
