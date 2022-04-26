package codingTest;

import java.util.ArrayList;
import java.util.List;

public class TrieNode {
	
	boolean word;
	TrieNode[] children;
	int index;
	List<Integer> list;
	
	public TrieNode() {
		this.word = false;
		this.children = new TrieNode[26];
		index = -1;
		list = new ArrayList<>();
	}
}
