package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combine {

	
	public List<List<Integer>> combine(int n, int k) {
		
		
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> elements = new ArrayList<>();
		
		dfs2(result, elements, 1, k, n);
		
		return result;
	}
	
	public void dfs1(List<List<Integer>> result, List<Integer> elements, int target, int k, int n) {
	
		if(k == 0) {
			result.add(new ArrayList<>(elements));
			return;
			
		} else if(target == n + 1) {
			return;
			
		} else {
			elements.add(target);
			dfs1(result,elements, target+1, k-1, n);
			
			elements.remove(elements.size()-1);
			dfs1(result, elements, target+1, k, n);
		}
		
		
	}
	
	public void dfs2(List<List<Integer>> result, List<Integer> elements, int target, int k, int n) {
		
		if(k == 0) {
			result.add(new ArrayList<>(elements));
			return;
		}
		
		for(int i=target; i <= n - k + 1; i++) {
			elements.add(i);
			dfs2(result, elements, i + 1, k-1, n);
			elements.remove(elements.size() - 1);
		}
	}
}
