package algorithm.programmers.codingtest;

public class CorrectParentheses {

	boolean solution(String s) {

		int len = s.length();
		int stack = 0;

		for(int i=0; i<len; i++) {

			char p = s.charAt(i);

			if(p == ')' && stack < 0) {
				return false;
			} else if(p == ')' && stack > 0) {
				stack--;
			} else {
				stack++;
			}
		}

		return stack == 0 ? true : false;
	}
}
