package algorithm;

public class IsBalanced {

	public boolean isBalanced(TreeNode root) {
		
		return check(root) != -1;
	}
	
	private int check(TreeNode node) {
		
		if(node == null) {
			return 0;
		}
		
		int left = check(node.left);
		int right = check(node.right);
		
		if(left == -1 || right == -1 || Math.abs(left - right) > 1) {
			return -1;
		}
		
		return Math.max(left, right) + 1;
	}
}
