package algorithm.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KthLargestElementInAnArray {
	
	public int findKthLargest(int[] nums, int k) {
		
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
	
	public int soloution2(int[] nums, int k) {

		List<Integer> wrapper = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Collections.sort(wrapper, Collections.reverseOrder());
		return wrapper.get(k - 1);
	}
	

	public int soloution3(int[] nums, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(
				(Integer a, Integer b) -> (a > b ? -1 : 1));
			
			for(int value : nums) {
				pq.add(value);
			}
			
			for(int i=0; i<k-1; i++) {
				pq.poll();
			}
			
			return pq.poll();
	}


}
