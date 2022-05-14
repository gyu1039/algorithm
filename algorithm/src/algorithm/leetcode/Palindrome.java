package algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.regex.Pattern;

public class Palindrome {

	public boolean isPalindrome(String s) {
		
		ArrayDeque<Character> tmp = new ArrayDeque<>();
		s = s.toLowerCase();
		
		
		for(char t : s.toCharArray()) {
			if(Character.isLetterOrDigit(t)) {
				tmp.addLast(t);
			}
		}
		
		
		while(tmp.size() > 1) {
			if(tmp.pollFirst() != tmp.pollLast()) return false;
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("0P".toLowerCase());
		System.out.println(Character.isLetterOrDigit("0P".charAt(0)));
		
	}
	
}
