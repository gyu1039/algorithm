package algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class InvertTree {

	 public TreeNode invertTree(TreeNode root) {
	 
		 if(root == null) return null;
		 
		 Deque<TreeNode> deque = new ArrayDeque<>();
		 deque.addLast(root);
		 
		 while(deque != null && !deque.isEmpty()) {
			 TreeNode tmp = null;
			 TreeNode node = deque.pollFirst();
			 tmp = node.left;
			 node.left = node.right;
			 node.right = tmp;
			 
			 if(node.left != null) deque.addLast(node.left);
			 if(node.right != null) deque.addLast(node.right);
		 }
		 
		 return root;
	 }
	
}
