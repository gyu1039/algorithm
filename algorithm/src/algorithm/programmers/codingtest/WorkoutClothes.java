package algorithm.programmers.codingtest;

import java.util.HashSet;
import java.util.Set;

public class WorkoutClothes {

	public int solution(int n, int[] lost, int[] reserve) {

		int lenLost = lost.length;
		int answer = n - lenLost;

		
		Set<Integer> reserveSet = new HashSet<>();
		
		for(int r : reserve) {
			reserveSet.add(r);
		}
		
		for(int l : lost) {
			if(reserveSet.contains(l)) {
				reserveSet.remove(l);
				answer++;
			}
		}
		
		for(int l : lost) {
			
			int lLeft = l-1;
			if(reserveSet.contains(lLeft)) {
				answer++;
				reserveSet.remove(lLeft);
				continue;
			}
			
			int lRight = l+1;
			if(reserveSet.contains(lRight)) {
				answer++;
				reserveSet.remove(lRight);
				continue;
			}
			
		}
		
		
		return answer;
	}

	
}
