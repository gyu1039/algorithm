package algorithm.leetcode;

import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {

	public static void main(String[] args) {
		
		

	}
	
	public int[] productExceptSelf(int[] nums) {
		
		int[] result = new int[nums.length]; 
		int count = nums.length;
		
		int p = 1;
		
		for(int i=0; i < count; i++) {
			result[i] = p;
			p = p * nums[i];
		}
		
		p = 1;
	
		for(int i=count-1; i > -1 ; i--) {
			result[i] = result[i] * p;
			p = p * nums[i] ;
			
		}
		
		return result;
	}

}
