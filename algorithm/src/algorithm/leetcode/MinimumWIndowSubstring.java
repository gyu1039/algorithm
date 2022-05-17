package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWIndowSubstring {

	public String minWindow(String s, String t) {


		int sLen = s.length();
		int tLen = t.length();
		if(sLen < tLen) return "";

		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<tLen; i++) {
			char c = t.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int i=0, j=0, count = map.size();
		int left = 0, right = sLen - 1, min = sLen;

		boolean found = false;

		while(j < sLen) {
			char endChar = s.charAt(j++);
			if(map.containsKey(endChar)) {
				map.put(endChar, map.get(endChar) - 1);
				if(map.get(endChar) == 0) count -= 1;
			}

			if(count > 0) continue;

			while(count == 0) {
				char startChar = s.charAt(i++);
				if(map.containsKey(startChar)) {
					map.put(startChar, map.get(startChar) + 1);
					if(map.get(startChar) > 0) count += 1;
				}
			}
			
			if((j - i) < min) {
				left = i;
				right = j;
				min = j - i;
				
				found = true;
			}
		}

		return !found ? "" : s.substring(left - 1, right);
	}
}

//