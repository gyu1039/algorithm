package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1991 {


	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Node root = new Node('A', null, null);
		Node node = root;

		for(int i=0; i<N; i++) {

			String s = br.readLine();
			char e = s.charAt(0);
			char lchild = s.charAt(2);
			char rchild = s.charAt(4);

			Node p = findNode(node, e); 

			p.left = new Node(lchild, null, null);
			p.right = new Node(rchild, null, null);
		}
		
		sb = new StringBuilder();
		preOrder(root);
		sb.append("\n");
		
		inOrder(root);
		sb.append("\n");
		
		postOrder(root);
		sb.append("\n");
		
		System.out.println(sb);

	}

	private static void preOrder(Node p) {
		
		if(p == null) {
			return;
		}
		
		if(p.e != '.' ) {
			sb.append(p.e);
			
		}
		preOrder(p.left);
		preOrder(p.right);
	}
	
	private static void inOrder(Node p) {
		
		if(p.left != null) {
			inOrder(p.left);
		}
		
		if(p.e != '.' ) {
			sb.append(p.e);
			
		}
		
		if(p.right != null) {
			inOrder(p.right);
		}
		
		
	}

	private static void postOrder(Node p) {
		
		if(p.left != null) {
			postOrder(p.left);
		}
		
		if(p.right != null) {
			postOrder(p.right);
		}
		
		if(p.e != '.' ) {
			sb.append(p.e);
			
		}
	}


	public static Node findNode(Node node, char e) {

		if(node == null) {
			return null;
		}

		if(node.e == e) {
			return node;
		}

		Node left = findNode(node.left, e);
		Node right = findNode(node.right, e);

		return left == null ? right : left;
	}

	static class Node {

		char e;
		Node left;
		Node right;

		public Node(char e, Node l, Node r) {
			this.e = e;
			this.left = l;
			this.right = r;
		}

	}
}
