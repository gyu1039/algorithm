package algorithm.programmers.codingtest;

import java.util.Arrays;

public class ArrangeInDescendingOrderOfStrings {

	public static String solution(String s) {
		
		char[] ar = s.toCharArray();
		Arrays.sort(ar);

		return new StringBuilder(new String(ar)).reverse().toString(); 
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution("Zbcdefg"));
	}
}
