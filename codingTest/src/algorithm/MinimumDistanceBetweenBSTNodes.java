package algorithm;

import java.util.Stack;

public class MinimumDistanceBetweenBSTNodes {
	
	int result = (int) Math.pow(10, 5) + 1;
	int prev = -result;
	
	public int minDiffInBST(TreeNode root) {
		
		if(root.left != null) {
			minDiffInBST(root.left);
		}
		
		result = Math.min(result, root.val - prev);
		prev = root.val;
		
		if(root.right != null) {
			minDiffInBST(root.right);
		}
		
		return result;
	}
	
	public int mindDiffInBST2(TreeNode root) {
		
		int result = (int) Math.pow(10, 5) + 1;
		int prev = -result;
		
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		
		while(!stack.isEmpty() || node != null) {
			
			while(node != null) {
				stack.add(node);
				node = node.left;
			}
			
			node = stack.pop();
			
			result = Math.min(result, node.val - prev);
			prev = node.val;
			
			node = node.right;
		}
		
		
		return result;
	}
}
