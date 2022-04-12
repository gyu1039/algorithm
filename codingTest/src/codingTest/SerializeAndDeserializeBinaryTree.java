package codingTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class SerializeAndDeserializeBinaryTree {

	 // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	
    	if(root == null) return null;

    	StringBuilder sb = new StringBuilder();
    	Deque<Optional<TreeNode>> deque = new ArrayDeque<>();
    	deque.add(Optional.of(root));
    	
    	while(!deque.isEmpty()) {
    		Optional<TreeNode> ot = deque.pollFirst();
    		
    		TreeNode node = ot.orElse(null);
    		if(node != null) {
    			sb.append(node.val + " ");
    			deque.addLast(Optional.ofNullable(node.left));
    			deque.addLast(Optional.ofNullable(node.right));
    		} else {
    			sb.append("null ");
    		}
    	}
    	
    	return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    	
    	if(data == null) return null;
    	
    	String[] nodes = data.split(" ");
    	int index = 0;
    	
    	TreeNode root = new TreeNode(Integer.parseInt(nodes[index]));
    	Deque<TreeNode> deque = new ArrayDeque<>();
    	deque.addLast(root);
    	
    	while(!deque.isEmpty()) {

    		TreeNode node = deque.pollFirst();
    		
    			
			if(!nodes[index + 1].equals("null")) {
				node.left = new TreeNode(Integer.parseInt(nodes[index + 1]));
				deque.addLast(node.left);
			}
			
			if(!nodes[index + 2].equals("null")) {
				node.right = new TreeNode(Integer.parseInt(nodes[index + 2]));
				deque.addLast(node.right);
			}
			
			index += 2;
    	}
    	
    	return root;
    }
    
    public static void main(String[] args) {
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append(1 + " ");
    	sb.append(1 + " ");
    	sb.append(1 + " ");
    	
    	String test = sb.toString();
    	String[] tests = test.split(" ");
    	
    	
    	for(String s : tests) {
    		System.out.println(s);
    	}
    	
    
    }
}
