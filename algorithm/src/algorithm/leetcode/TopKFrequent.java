package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent{

	
	public int[] topKFrequent(int[] nums, int k) {
		
		Map<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
				((Integer a, Integer b) -> map.get(b) - map.get(a)));
		
		int[] result = new int[k];
		
		for(int n : nums) {
			if(!map.containsKey(n)) map.put(n, 1);
			else map.put(n, map.get(n) + 1);
		}
		
		for(Integer num : map.keySet()) {
			priorityQueue.add(num);
		}
		
		for(int i=0; i<k; i++) {
			
			result[i] = priorityQueue.poll();
		}
		
		return result;
	}
}
