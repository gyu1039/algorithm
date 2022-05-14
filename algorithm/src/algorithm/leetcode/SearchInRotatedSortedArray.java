package algorithm.leetcode;

public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		
		while(left < right) {
			int mid = left + (right - left) / 2;
			
			if(nums[mid] > nums[right]) left = mid + 1;
			else right = mid;
		}
		
		int pivot = left;
		
		left = 0;
		right = nums.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			int mid_pivot = (mid + pivot) % nums.length;
			
			if(nums[mid_pivot] < target) left = mid + 1;
			else if(nums[mid_pivot] > target) right = mid - 1;
			else return mid_pivot;
		}
		
		return -1;
	}
}
