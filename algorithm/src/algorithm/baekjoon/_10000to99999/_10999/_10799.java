package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10799 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bracket = br.readLine();
		int len = bracket.length();
		int cnt = 0;

		int stack = 0;
		
		for(int i=0; i<len; i++) {
			
			if(bracket.charAt(i) == '(' && bracket.charAt(i+1) == ')') {
				cnt += stack;
				i++;
			} else if(bracket.charAt(i) == '(') {
				stack++;
			} else if(bracket.charAt(i) == ')') {
				cnt += 1;
				stack--;
			}
		}
		
		System.out.println(cnt);
	}
}
