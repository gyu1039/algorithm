package algorithm.leetcode;

public class DiameterOfBinaryTree {

	int diameter = 0;

	public int diameterOfBinaryTree(TreeNode root) {
        
		dfs(root);
		
		return diameter;
    }
	
	public int dfs(TreeNode node) {
		
		if(node == null) {
			return -1; 
		}
		
		int left = dfs(node.left);
		int right = dfs(node.right);
		
		diameter = Math.max(diameter ,(left + right + 2));
		return Math.max(left, right) + 1;
	}
}
