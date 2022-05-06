package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class NetworkDelayTime {

	public int networkDelayTime(int[][] times, int n, int k) {
	    
		Map<Integer, List<int[]>> graph = new HashMap<>();
		
		for(int[] a : times) {
			int s = a[0];
			int target = a[1];
			int weight = a[2];
			
			if(!graph.containsKey(s)) {
				graph.put(s, new ArrayList<>());
			} 
			graph.get(s).add(new int[] {target, weight});
		}
		
        
		//  Q[(w, t)]
		PriorityQueue<int[]> pq = new PriorityQueue<>(
				(int[] a, int[] b) -> a[0] < b[0] ? -1 : 1
			);
		
		pq.add(new int[] {0, k});
		
		Map<Integer, Integer> dist = new HashMap<>();
		
		while(pq != null && !pq.isEmpty()) {

			int[] tmp = pq.poll();
			int time = tmp[0];
            int node = tmp[1];
            
			if(!dist.containsKey(node)) {

				dist.put(node, time);
                
                if(graph.get(node) != null) {
                    
                    for(int[] edges : graph.get(node)) {
						int w = edges[1];
						int t = edges[0];
		                
						int alt = time + w;
						pq.add(new int[] {alt, t});
				    }    
                }
				
			}
		}
		
		if(dist.size() == n) {
			return Collections.max(dist.values());
		}
		
		return -1;
    }
    

	
	public static void main(String[] args) {
		
	 	PriorityQueue<List<Integer>> t = new PriorityQueue<List<Integer>>(
				(List<Integer> a, List<Integer> b) -> a.get(0) < b.get(0) ? -1 : 1
				);
		
		t.add(List.of(1,1));
		t.add(List.of(1,3));
		
		System.out.println(t.poll().get(1));
		System.out.println(t.poll().get(1));
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1,2);
		map.put(3,4);
		
		System.out.println(map.get(2));
	}
}
