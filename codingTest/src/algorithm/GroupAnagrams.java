package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		
		Map<String, ArrayList<String>> result = new HashMap<String, ArrayList<String>>();
		
		char[] sortedArray;
		String sortedWord;
		
		for(String word : strs) {
			sortedArray = word.toCharArray();
			Arrays.sort(sortedArray);
			// ��ü ����
			// sortedArray.toString() -> ��ü�� �������� ������ �´�.
			
			sortedWord = new String(sortedArray);
			
			if(!result.containsKey(sortedWord)) {
				System.out.println(sortedWord);
				result.put(sortedWord, new ArrayList<String>());	
			}
		
			result.get(sortedWord).add(word);
		}
		
		
		return new ArrayList<List<String>>(result.values());	
		 
	}
	
	public static void main(String[] args) {
		
		
		GroupAnagrams test = new GroupAnagrams();
		String[] myArr = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(test.groupAnagrams(myArr));
		
		
	}

}
