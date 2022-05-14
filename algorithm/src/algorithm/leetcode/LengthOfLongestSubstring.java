package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
	
	public int lengthOfLongestSubstring(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		int start, max_length;
		start = max_length = 0;
		char[] arr = s.toCharArray();
		
		int idx = 0;
		for(char ch : arr) {
			if(map.containsKey(ch) && start <= map.get(ch)) {
				start = map.get(ch) + 1;
			} else {
				max_length = Math.max(max_length, idx - start + 1);
			}

			map.put(ch, idx);
		}
		
		return max_length;
	}
}
