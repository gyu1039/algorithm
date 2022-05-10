package algorithm;

import java.util.Arrays;

public class BinarySearch {

	public int search1(int[] nums, int target) {

		int index = Arrays.binarySearch(nums, target);
		return index < 0 ? -1 : index;
	}

	public int search2(int[] nums, int target) {
		
		return binarySearch(0, nums.length - 1, nums, target);
	}
	
	public int binarySearch(int left, int right, int[] nums,int target) {
		
		int mid = 0;
		
		if(left <= right) {
			mid = left + (right - left) / 2;
			
			if(nums[mid] < target) return binarySearch(mid + 1, right, nums, target);
			else if(nums[mid] > target) return binarySearch(left, mid - 1, nums, target);
			else return mid;
		} else 
			return -1;
		
	}
	
}
