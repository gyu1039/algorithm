package algorithm.leetcode;

public class MergeTrees {

	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
		if(root1 != null && root2 != null) {
			TreeNode node = new TreeNode(root1.val + root2.val);
			node.left = mergeTrees(root1.left, root2.left);
			node.right = mergeTrees(root1.right, root2.right);
			
			return node;
		} else if(root1 != null && root2 == null) {
			return root1;
		} else {
			return root2;
		}
    }
}
