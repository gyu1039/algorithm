package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _4949 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); 

		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();


		while(!s.equals(".")) {

			int len = s.length();

			t: for(int i=0; i<len; i++) {

				switch(s.charAt(i)) {

				case '(':
					stack.add(0);
					break;

				case '[':
					stack.add(1);
					break;

				case ']':
					if(stack.isEmpty() || stack.peek() != 1) {
						stack.push(-1);
						break t;
					};
					stack.pop();
					break;

				case ')':
					if(stack.isEmpty() ||  stack.peek() != 0) {
						stack.push(-1);
						break t;
					};
					stack.pop();
					break;
				}


			}

			if(stack.isEmpty()) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
			stack.removeAllElements();
			s = br.readLine();
		}


		System.out.println(sb);
		
	}
}
