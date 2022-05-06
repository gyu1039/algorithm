package algorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class MinimumHeightTrees {
	
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		
		if(n <= 1) return new ArrayList<>(Arrays.asList(0));
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int[] edge : edges) {
			int i = edge[0];
			int j = edge[1];
			if(!map.containsKey(i)) map.put(edge[0], new ArrayList<>());
			if(!map.containsKey(j)) map.put(edge[1], new ArrayList<>());
			map.get(i).add(j);
			map.get(j).add(i);
		}
		
		List<Integer> leaves = new ArrayList<>();
		for(int key : map.keySet()) {
			if(map.get(key).size() == 1) { 
				leaves.add(key);
			}
		}
		
		while(n > 2) {
			n -= leaves.size();
			List<Integer> newLeaves = new ArrayList<>();
			
			for(Integer leaf : leaves) {
				Integer t = map.get(leaf).remove(0);
				map.get(t).remove(leaf);
				
				if(map.get(t).size() == 1) {
					newLeaves.add(t);
				}
			}
			
			leaves = newLeaves;
		}
		
		return leaves;
	}
}

