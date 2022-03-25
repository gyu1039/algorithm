package codingTest;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> result = new ArrayList<>();
		
		dfs(0, new ArrayList<>(), target, result, candidates);
		
		return result;
	}
	
	public void dfs(int index, List<Integer> candidatesSum, int target, List<List<Integer>> result, int[] candidates) {
		
		if(target < 0) {
			return;
		}
		
		if(target == 0) {
			result.add(new ArrayList<>(candidatesSum));
			return;
		}
		
		
		for(int i=index; i<candidates.length; i++) {
			
			candidatesSum.add(candidates[i]);
			dfs(i, candidatesSum, target - candidates[i], result, candidates);
		}
		
	}
}
