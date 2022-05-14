package algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWIndowMaximum {
	
	public int[] maxSlidingWindow(int[] nums, int k) {
		
		int n = nums.length;
		int[] result = new int[n - k + 1];
		Deque<Integer> windows = new ArrayDeque<Integer>(); 

		for(int i=0; i<n; i++) {

			while(windows.size() > 0 && windows.peekFirst() <= i - k) 
				windows.pollFirst();
			
			while(windows.size() > 0 && nums[windows.peekLast()] < nums[i])
				windows.pollLast();
			
			windows.offerLast(i);
			if(i >= k - 1) {
				result[i-k+1] = nums[windows.peekFirst()]; 
			}
		}
		
		return result;
	}
	
}
