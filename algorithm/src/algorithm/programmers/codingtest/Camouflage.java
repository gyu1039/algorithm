package algorithm.programmers.codingtest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Camouflage {

	public int solution(String[][] clothes) {

		Map<String, Set<String>> map = new HashMap<>();
		for(String[] dress : clothes) {
			if(map.get(dress[1]) == null) {
				map.put(dress[1],new HashSet<>());
			}
			map.get(dress[1]).add(dress[0]);
		}

		int count = 1;
		for(String key : map.keySet()) {
			count *= (map.get(key).size()+1);
		}

		return count - 1;
	}
}
