package algorithm.programmers.codingtest;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelopment {

	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer;
		List<Integer> workday = new ArrayList<>();

		for(int i=0; i<speeds.length; i++) {
			int speed = speeds[i];
			int remainingPeriod = 100 - progresses[i];
			int count = 0;
			while(remainingPeriod > 0) {
				remainingPeriod -= speed;
				count++;
			}
			workday.add(count);
		}

		int[] tmp = new int[speeds.length];
		int prev = 0;
		tmp[prev]++;
		int count = 1;
		for(int i=1; i<speeds.length; i++) {
			if(workday.get(i) <= workday.get(prev)) {
				tmp[prev]++;
				continue;
			}

			prev = i;
			tmp[prev] = 1;
			count++;
		}

		answer = new int[count];
		int idx = 0;
		for(int n : tmp) {
			if(n != 0) {
				answer[idx++] = n;
			}
		}
		return answer;
	}
}
