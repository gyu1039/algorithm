package algorithm.leetcode;

import java.util.Arrays;

public class ArrayPariSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int arrayPairSum(int[] nums) {
		
		int sum = 0;
		int count = nums.length;
		
		Arrays.sort(nums);
		
		
		for(int i=0; i<count; i+=2)
			sum += nums[i];
		
		return sum;
		
	}
}
