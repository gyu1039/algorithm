package algorithm.programmers.codingtest;

public class GetMiddleLetter {

	public String solution(String s) {

		int len = s.length();
		String answer = s.substring((len-1) / 2, len/2 + 1);
		return answer;
	}
}
