package algorithm.programmers.codingtest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tuple {

	public int[] solution(String s) {

		String[] ar = s.substring(2, s.length()-2).split("(\\},\\{)");
		Arrays.sort(ar, (ar1, ar2) -> {
			return ar1.length() > ar2.length() ? 1 : -1;
		});

		Set<Integer> set = new HashSet<>();
		int[] answer = new int[ar.length];
		int idx = 0;
		for(String nums : ar) {
			
			for(String num : nums.split(",")) {
				
				int n = Integer.parseInt(num);
				if(set.add(n)) {
					answer[idx++] = n;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {

		String s = "{{20,111},{111}}";
		String[] nums = s.substring(2,s.length()-2).split("(\\},\\{)");

		for(String num : nums) {
			System.out.println(num);
		}
	}
}
