package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

int i = 0;
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {

		if(inorder != null && inorder.length != 0) {
			
			int index = findIndex(inorder, preorder[i++]);
			
			TreeNode node = new TreeNode(inorder[index]);
			
			node.left = buildTree(preorder, Arrays.copyOfRange(inorder, 0, index));
			node.right = buildTree(preorder, Arrays.copyOfRange(inorder, index + 1, inorder.length));
					
					
			return node;
		}
		
		return null;
    }
	
	public int findIndex(int[] array, int value) {
		
		int index = array.length;
		for(int i=0; i < index; i++) {
			if(array[i] == value) return i;
		}
		
		return -1;
	}
	
	
}
