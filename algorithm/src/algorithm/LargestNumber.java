package algorithm;

import java.util.Arrays;

public class LargestNumber {

	public String largestNumber(int[] nums) {

		String[] ar = new String[nums.length];;
		
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = String.valueOf(nums[i]);
		}
		
		Arrays.sort(ar, (a, b) -> (b+a).compareTo(a+b));
		if(ar[0].equals("0")) return "0";
		
		StringBuilder sb = new StringBuilder();
		for(String s : ar) {
			sb.append(s);
		}
		
		return sb.toString();
	}
	
}
