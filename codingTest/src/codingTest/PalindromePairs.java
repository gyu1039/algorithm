package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePairs {

	public List<List<Integer>> palindromePairs(String[] words) {

		List<List<Integer>> res = new ArrayList<>();

		TrieNode root = new TrieNode();

		for (int i = 0; i < words.length; i++) {
			addWord(root, words[i], i);
		}

		for (int i = 0; i < words.length; i++) {
			search(words, i, root, res);
		}

		return res; 
	}

	public void addWord(TrieNode node, String word, int index) {
		
		for (int i = word.length() - 1; i >= 0; i--) {
			int j = word.charAt(i) - 'a';

			if (node.children[j] == null) {
				node.children[j] = new TrieNode();
			}

			if (isPalindrome(word, 0, i)) {
				node.list.add(index);
			}

			node = node.children[j];
		}

		node.list.add(index);
		node.index = index;
	}

	public void search(String[] words, int i, TrieNode node, List<List<Integer>> res) {
		
		for (int j = 0; j < words[i].length(); j++) {	
			if (node.index >= 0 
					&& node.index != i 
					&& isPalindrome(words[i], j, words[i].length() - 1)) {
				res.add(Arrays.asList(i, node.index));
			}

			node = node.children[words[i].charAt(j) - 'a'];
			if (node == null) return;
		}

		for (int j : node.list) {
			if (i == j) continue;
			res.add(Arrays.asList(i, j));
		}
	}

	public boolean isPalindrome(String s, int i, int j) {

		while(i <= j) 
			if(s.charAt(i++) != s.charAt(j--)) return false;

		return true;
	}
}
