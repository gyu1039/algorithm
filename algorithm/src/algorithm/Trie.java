package algorithm;

public class Trie {

	TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		
		TrieNode node = this.root;
		
		for(char w : word.toCharArray()) {
			
			int idx = w - 'a';
			if(node.children[idx] == null) node.children[idx] = new TrieNode();
			node = node.children[idx];
		}
		
		node.word = true;
	}

	public boolean search(String word) {

		TrieNode node = this.root;
		
		for(char w : word.toCharArray()) {
			
			int idx = w - 'a';
			if(node.children[idx] == null) return false;
			node = node.children[idx];
		}
		
		return node.word;
	}

	public boolean startsWith(String prefix) {

		TrieNode node = this.root;
		
		for(char p : prefix.toCharArray()) {
			
			int idx = p - 'a';
			if(node.children[idx] == null) return false;
			node = node.children[idx];
		}
		
		return true;
	}
}
