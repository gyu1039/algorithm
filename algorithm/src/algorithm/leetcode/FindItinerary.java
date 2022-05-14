package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindItinerary {

	public List<String> findItinerary(List<List<String>> tickets) {
	
		List<String> result = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		
		for(List<String> l : tickets) {
			
			String key = l.get(0);
			String value = l.get(1);
			
			if(map.containsKey(key)) {
				map.get(key).add(value);
			} else {
				map.put(key, new ArrayList<>());
				map.get(key).add(value);
			}
			Collections.sort(map.get(key));
		}
		
		dfs(result, map, "JFK");
		
		Collections.reverse(result);
		
		return result;
    }
	
	public void dfs(List<String> result, Map<String, List<String>> map, String s) {
		
		
		while(map.get(s) != null && !map.get(s).isEmpty()) {
			dfs(result, map, map.get(s).remove(0));
		}
		result.add(s);
	}
	
	public static void main(String[] args) {
		
		FindItinerary test = new FindItinerary();
		List<List<String>> param = new ArrayList<>();
		param.add(new ArrayList<>(Arrays.asList("MUC", "LHR")));
		param.add(new ArrayList<>(Arrays.asList("JFK", "MUC")));
		param.add(new ArrayList<>(Arrays.asList("SFO", "SJC")));
		param.add(new ArrayList<>(Arrays.asList("LHR", "SFO")));
		
		System.out.println(test.findItinerary(param));
		
	}

}
