package codingTest;

public class BinarySearchTreeToGreaterSumTree {
	
	int val;
	
	public TreeNode bstToGst(TreeNode root) {
		
		if(root != null) {
			bstToGst(root.right);
			this.val += root.val;
			root.val = this.val;
			bstToGst(root.left);
		}
		return root;
	}
}
