package algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestFalindrome {

	public static void main(String[] args) {
		System.out.println(5/2);

	}

	public String longestPalindrome(String s) {
		
	    if (s == null || s.length() < 1) return "";
	    int start = 0, end = 0;
	    
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);
	        int len2 = expandAroundCenter(s, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    
	    return s.substring(start, end + 1);
	}

	private int expandAroundCenter(String s, int left, int right) {
	    int L = left, R = right;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}
	
	
//	public String longestFalindrome(String s) {
//	
//		StringBuilder tmp = new StringBuilder(s);
//		String reversedString= tmp.reverse().toString();
//		int count = s.length();
//		
//		if(s.length() < 2 || s == reversedString) {
//			return s;
//		}
//		
//		String temp1 = "";
//		String temp2 = "";
//		String result = ""; 
//		
//		
//		
//		for(int i=0; i < count-1; i++) {
//			temp1 = expand(s, i, i+1);
//			temp2 = expand(s, i, i+2);
//			
//			
//			result = (result.length() > temp1.length()) ? result : temp1;
//			result = (result.length() > temp2.length()) ? result : temp2;	
//		}
//		return result;
//	}
//	
//	public String expand(String s, int left, int right) {
//		
//		while(left >= 0 && right <= s.length() && s.charAt(left) == s.charAt(right-1)) {
//			left -= 1;
//			right += 1;
//			if(left < 0 || right > s.length()) break;
//		}
//		
//		return s.substring(left+1, right-1);
//	}
//	
	
	
	
}
