package codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] test = {1,2,3,4,5,6};
		
		List<int[]> tmp = Arrays.asList(test);
		
		System.out.println(tmp.get(0)[1]);
	

	}

	public int[] twoSum(int[] nums, int target) {

		 
		Map<Integer, Integer> numMap = new HashMap<>();
		int count = nums.length;
		int complement;
		
		for(int i=0; i<count; i++) {
			complement = target - nums[i];	
			if(numMap.containsKey(complement)) {
				return new int[] {numMap.get(complement), i};
			} else {
				numMap.put(nums[i], i);
			}
		}
		
		return new int[] {};
	}
}
