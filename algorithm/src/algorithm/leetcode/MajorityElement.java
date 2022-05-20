package algorithm.leetcode;

import java.util.Arrays;

public class MajorityElement {
	
	public int majorityElement(int[] nums) {

		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
	
	public int majorityElement2(int[] nums) {
		
		int count = 1, value=nums[0];

		for(int n : nums) {
			if(value == n) count++;
			else {
				count--;
				if(count==0) {
					value = n;
					count = 1;
				}
			}
		}

		return value; 
	}
}
