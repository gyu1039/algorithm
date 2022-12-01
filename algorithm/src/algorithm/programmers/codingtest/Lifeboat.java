package algorithm.programmers.codingtest;

import java.util.Arrays;

public class Lifeboat {

	public int solution(int[] people, int limit) {

		Arrays.sort(people);

		int answer = 0;
		int lo = 0;

		for(int i=people.length - 1; i >= lo; i--) {

			if(people[i] + people[lo] > limit) {
				answer++;
				continue;
			}

//			while(sum + people[lo] <= limit) {
//				sum += people[lo];
//				lo++;
//			}
			lo++;
			answer++;
		}


		return answer;
	}
}
