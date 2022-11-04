package algorithm.programmers.codingtest;

public class TheAdditionOfNegativeAndPositive {

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		int len = signs.length;
		
		for(int i=0; i<len; i++) {
			if(signs[i]) answer += absolutes[i];
			else answer -= absolutes[i];
			
			// answer += absolutes[i] * (signs[i] ? 1 : -1);
		}
		
		
		return answer;
	}
}
