package algorithm.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TaskScheduler {

	public int leastInterval(char[] tasks, int n) {

		int[] counts = new int[26];
		for(char task : tasks)
			counts[task - 'A']++;
		
		Arrays.sort(counts);
		int chunk = counts[25] - 1;
		int idleSpots = chunk * n;
		
		for(int i = 24; i>=0; i--) {
			idleSpots -= Math.min(chunk, counts[i]);
		}

		return idleSpots < 0 ? tasks.length : idleSpots + tasks.length;
	}
	
	public static void main(String[] args) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('a', 12);
		map.put('b', 13);
		map.put('c', 14);
		
		Entry<Character, Integer> maxEntry 
		= Collections.max(map.entrySet(), 
				(e1, e2) -> e1.getValue().compareTo(e2.getValue()));
		
		System.out.println(maxEntry.getValue());
	}
}
