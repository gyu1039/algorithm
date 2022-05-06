package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CourseSchedule {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
        
		Map<Integer, List<Integer>> graph = new HashMap<>();
		Set<Integer> traced = new HashSet<>();
		Set<Integer> visited = new HashSet<>();
		
		for(int[] a : prerequisites) {
			
			int key = a[0];
			int value = a[1];
			if(!graph.containsKey(key)) {
				graph.put(key, new ArrayList<>());
			} 
			graph.get(key).add(value);
		}
		
		for(Integer i : graph.keySet()) {
			if(!dfs(i, graph, traced, visited)) return false; 
		}
		
		return true;
    }
	
	public boolean dfs(Integer i, Map<Integer, List<Integer>> graph, Set<Integer> traced, Set<Integer> visited) {
		
		if(traced.contains(i)) {
			return false;
		}
		if(visited.contains(i)) {
			return true;
		}
		
		traced.add(i);
		
		while(graph.get(i) != null && !graph.get(i).isEmpty()) {
			if(!dfs(graph.get(i).remove(0), graph, traced, visited)) {
				return false;
			}
		}
		
		traced.remove(i);
		visited.add(i);
		
		return true;
	}
}
