package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> threeSum(int[] nums) {

		
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		int count = nums.length;
		
		int left, right, sum;
		
		for(int i=0; i<count-2; i++) {
			left = i+1;
			right = count-1;
			
			if(i > 0 && nums[i] == nums[i-1]) continue;
			
			while(left < right) {
				sum = nums[i] + nums[left] + nums[right];
				
				if(sum > 0) {
					right-= 1;
				} else if(sum < 0) {
					left+= 1;
				} else {
					result.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[left], nums[right])));
					
					while(left < right && nums[left] == nums[left+1]) left++;
					while(left < right && nums[right] == nums[right-1]) right--;
					left++;
					right--;
				}
				
				
			}
			
		}
		
		return result;
	}
}
