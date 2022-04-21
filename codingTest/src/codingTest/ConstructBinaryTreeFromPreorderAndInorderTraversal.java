package codingTest;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	Map<Integer, Integer> map;
	int i;
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
		map = new HashMap<>();
		
		int size = inorder.length;
		for(int i = 0; i<size; i++) {
			map.put(inorder[i], i);
		}
		
		return helper(preorder, inorder, 0, size - 1, size);
	}

	public TreeNode helper(int[] preorder, int[] inorder, int inStart, int inEnd, int inCount) {

		TreeNode node = null;
		
		if(i < preorder.length && inStart <= inEnd && inCount > 0) {
			int index = map.get(preorder[i]);
			
			node = new TreeNode(preorder[i++]);
			
			node.left = helper(preorder, inorder, inStart, index - 1, (index - 1) - inStart + 1);
			node.right = helper(preorder, inorder, index + 1, inEnd, inEnd - inStart + 1);
		}
		
		return node;
	}
}
