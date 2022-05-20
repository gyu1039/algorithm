package algorithm.leetcode;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {

		int bestSum = Integer.MIN_VALUE;
		int currentSum = 0;
		
		for(int num : nums) {
			currentSum = Math.max(num, currentSum + num);
			bestSum = Math.max(bestSum, currentSum);
		}
		
		return bestSum;
	}
}
