package algorithm.programmers.codingtest;

public class TheNextBigNumber {

	public int solution(int n) {

		int cnt = Integer.bitCount(n);

		int answer = 0;
		for(int i=n+1; true; i++) {

			if(Integer.bitCount(i) == cnt) {
				answer = i;
				break;
			}
		}


		return answer;
	}

	
}
