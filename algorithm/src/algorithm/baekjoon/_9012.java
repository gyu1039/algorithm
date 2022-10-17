package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		final String YES = "YES\n";
		final String NO = "NO\n";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			
			String s = br.readLine();
			
			boolean flag = true;
			for(char c : s.toCharArray()) {
				
				if(c == '(') {
					stack.push(1);
				} else if(stack.isEmpty()) {
					sb.append(NO);
					flag = false;
					break;
				} else {
					stack.pop();
				}
			}
			
			if(flag) {
				String t = stack.isEmpty() ? YES : NO;
				sb.append(t);
			}
			
			stack.removeAllElements();
		}
		
		System.out.println(sb);
			
	}
}
