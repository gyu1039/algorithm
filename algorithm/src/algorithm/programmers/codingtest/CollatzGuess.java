package algorithm.programmers.codingtest;

public class CollatzGuess {

	public int solution(long num) {

		if(num == 1) {
			return 0;
		}

		int answer = 0;
		while(num != 1 && answer <= 500) {
			answer++;
			num = num % 2 == 0 ? num / 2 : num*3 + 1;
		}

		return answer > 500 ? -1 : answer;
	}
}
