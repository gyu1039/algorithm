package algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public int[] intersection1(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i, j;
		i = j = 0;
		
		int len1 = nums1.length;
		int len2 = nums2.length;
		
		Set<Integer> set = new HashSet<>();
		
		while(i < len1 && j < len2) {
			if(nums1[i] > nums2[j]) j++;
			else if(nums1[i] < nums2[j]) i++;
			else {
				set.add(nums1[i]);
				i++;
				j++;
			}
		}
		
		int idx = 0;
		int[] result = new int[set.size()];
		for(int s : set) {
			result[idx++] = s;
		}
		
		return result;
	}
	
	public int[] intersection2(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<>();
		Arrays.sort(nums2);
		
		for(int n : nums1) {
			int idx = Arrays.binarySearch(nums2, n); 
			if(idx >= 0) {
				set.add(n);
			}
		}
		
		int idx = 0;
		int[] result = new int[set.size()];
		for(int s : set) {
			result[idx++] = s;
		}
		
		return result;
	}
}
