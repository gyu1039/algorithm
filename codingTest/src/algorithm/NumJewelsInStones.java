package algorithm;

import java.util.HashMap;
import java.util.Map;

public class NumJewelsInStones {

	public int newJewelsInStones(String jewels, String stones) {
		
		Map<Character, Integer> map = new HashMap<>();
		char[] s = stones.toCharArray();
		char[] j = jewels.toCharArray();
		int count = 0;
		
		for(char t : s) {
			if(!(map.containsKey(t))) {
				map.put(t, 1);
			} else {
				map.put(t, map.get(t) + 1);
			}
		}
		
		for(char t: j) {
			if(map.containsKey(t)) {
				count += map.get(t);
			}
		}
		
		return count;
	}
}
