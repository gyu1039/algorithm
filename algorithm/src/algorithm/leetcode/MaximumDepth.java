package algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepth {
	
	public int maxDepth(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		Deque<TreeNode> deque = new ArrayDeque<>();
		deque.addFirst(root);
		
		int deqth = 0;
		
		while(deque != null && !deque.isEmpty()) {
			
			deqth += 1;
			
			int size = deque.size();
			for(int i=0; i<size; i++) {
				TreeNode curRoot = deque.poll();
				if(curRoot.left != null) {
					deque.addLast(curRoot.left);
				}
				if(curRoot.right != null) {
					deque.addLast(curRoot.right);
				}
			}
			
			
		}
		
		return deqth;
	}

}
