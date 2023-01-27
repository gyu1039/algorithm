package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1935 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String postfixExpression = br.readLine();
		Stack<Double> stack = new Stack<>();
		double[] values = new double[N];
		
		for(int i=0; i<N; i++) {
			values[i] = Double.parseDouble(br.readLine());
		}
		
		for(int i=0; i<postfixExpression.length(); i++) {
			char cur = postfixExpression.charAt(i);
			
			if('A' <= cur && cur <= 'Z') {
				stack.push(values[cur -'A']);
				continue;
			}
			
			double operand2 = stack.pop();
			double operand1 = stack.pop();
			if(cur == '*') {
				stack.push(operand1 * operand2);
			} else if(cur == '+') {
				stack.push(operand1 + operand2);
			} else if(cur == '/') {
				stack.push(operand1 / operand2);
			} else if(cur == '-') {
				stack.push(operand1 - operand2);
			}
		}
		
		System.out.printf("%.2f", stack.pop());
	}
}
