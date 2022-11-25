package algorithm.programmers.codingtest;

import java.util.Arrays;

public class Budget {

	public int solution(int[] d, int budget) {

		int sum = 0;
		for(int n : d) {
			sum += n;
		}

		if(sum <= budget) {
			return d.length;
		}

		Arrays.sort(d);
		int answer = 0;
		for(int i=0; i<d.length; i++) {
			budget -= d[i];

			if(budget < 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}

}
