package algorithm.programmers.codingtest;

public class BasicOfWorkingWithStrings {

	public boolean solution(String s) {

		boolean answer = false;

		if(s.length() == 4 || s.length() == 6) {
			for(char c: s.toCharArray()) {
				if(!('0' <= c && c <= '9')) {
					return answer;
				}
			}

			answer = true;
		}

		return answer;
	}
}
