package algorithm.programmers.codingtest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RotateBrackets {

	public static void main(String[] args) {
		
		Deque<Character> d = new ArrayDeque<Character>(1000);
		

	}
	
	
	public int solution(String s) {
		int answer = 0;
		int len = s.length();
		Deque<Character> d = new ArrayDeque<>();
		Stack<Character> stack = new Stack<>();

		for(char c : s.toCharArray()) {
			d.addLast(c);
		}

		for(int i=0; i<len; i++) {
			answer += isRightBrackets(d, stack);
			d.addLast(d.poll());
			stack.clear();
		}

		return answer;
	}

	public static int isRightBrackets(Deque<Character> d, Stack<Character> s) {

		for(char c : d) {
			if(c == '(' || c == '[' || c == '{') {
				s.push(c);
				continue;
			}

			if(s.isEmpty()) {
				return 0;
			} 

			char comp = s.peek();
			if(c == ')' && comp != '(') {
				return 0;
			} else if(c == ']' && comp != '[') {
				return 0;
			} else if(c == '}' && comp != '{') {
				return 0;
			}

			s.pop();
		}

		return s.isEmpty() ? 1 : 0;
	}
}
