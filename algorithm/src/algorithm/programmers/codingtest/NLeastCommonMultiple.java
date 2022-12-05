package algorithm.programmers.codingtest;

import java.util.Arrays;

public class NLeastCommonMultiple {

	public int solution(int[] arr) {

		Arrays.sort(arr);
		int lcm = arr[0];      
		for(int i=1; i<arr.length; i++) {

			if(lcm < arr[i]) {
				int tmp = lcm;
				lcm = arr[i];
				arr[i] = tmp;
			}

			lcm = (lcm * arr[i] / gcd(lcm, arr[i]));
		}

		return lcm;
	}

	public static int gcd(int a, int b) {

		if(b == 0) {
			return a;
		}

		return gcd(b, a%b);
	}
}
