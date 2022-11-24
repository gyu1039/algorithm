package algorithm.programmers.codingtest;

import java.util.Arrays;

public class MakeTheLowest {

	public int solution(int[] A, int[] B) {

		int answer = 0;
		Arrays.sort(B);
		Arrays.sort(A);

		for(int i=0; i<B.length; i++) {
			answer += A[B.length - 1 - i] * B[i];    
		}

		return answer;
	}
}
