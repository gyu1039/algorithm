package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		dfs(result, 0, new ArrayList<>(), nums);
		
		return result;
    }
	
	public void dfs(List<List<Integer>> result, int index, List<Integer> subset, int[] nums) {
		
		result.add(subset);
		
		for(int i=index; i<nums.length; i++) {
			subset.add(nums[i]);
			dfs(result, i+1, new ArrayList<>(subset), nums);
			subset.remove(subset.size() - 1);
		}
		
	}

}
