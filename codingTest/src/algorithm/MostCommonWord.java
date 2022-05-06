package algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class MostCommonWord {
	
	public static void main(String[] args) {
		
		MostCommonWord test = new MostCommonWord();
		String[] tmp = {"bob", "hit"};
		
		System.out.println(test.mostCommonWord("Bob. hIt, baLl", tmp));
	
	}
	
	public String mostCommonWord(String paragraph, String[] banned) {
		
		HashMap<String, Integer> countWord = new HashMap<String, Integer>();
		String[] arr = paragraph.toLowerCase().split("[^a-zA-Z]+");
		
		
		for(String word : arr) {
			if(!countWord.containsKey(word)) {
				countWord.put(word, 1);
			} else {
				int count = (int)countWord.get(word);
				countWord.put(word, count+1);
			}
		}
//		countWord.remove("");
//		System.out.println(countWord);
		
		
		System.out.println(countWord);
		
		for(String ban : banned) {
			if(countWord.containsKey(ban)) {
				countWord.remove(ban);
			}
		}
		System.out.println(countWord);
		
		Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		};
		
		Entry<String, Integer> result = Collections.max(countWord.entrySet(), comparator);
		
		return result.getKey();
	}

}
