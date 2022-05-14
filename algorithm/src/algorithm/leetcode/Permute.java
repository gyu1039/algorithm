package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permute {

	List<List<Integer>> results;
	List<Integer> elements;
	List<Integer> prevElements;
	
	public List<List<Integer>> permute(int[] nums) {
		
		results = new ArrayList<>();	
		elements = new ArrayList<>(nums.length);
		prevElements = new ArrayList<>();
		
		for(int i : nums) elements.add(i);
		
		dfs(elements);
		
		return results;
	}
	
	public void dfs(List<Integer> elements) {
		
		if(elements.isEmpty()) {
			results.add(new ArrayList<Integer>(prevElements));
			return;
		}
		
		for(Integer i : elements) {
			
			List<Integer> list = new ArrayList<>(elements);
			
			prevElements.add(i);
			list.remove(i);
			dfs(list);
			prevElements.remove(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> test1 = new ArrayList<>();
		List<Integer> test2 = new ArrayList<>(test1);
		
	}
}
