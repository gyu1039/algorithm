package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
	
	public List<Integer> diffWaysToCompute(String expression) {

		List<Integer> result = new ArrayList<>();
		int expressionLength = expression.length();
		
		if(expression == null || expressionLength == 0) return result;
		
		
		for(int i=0; i<expressionLength; i++) {
			char c = expression.charAt(i);
			
			if(!isOperator(c)) continue;
			
			List<Integer> left = diffWaysToCompute(expression.substring(0, i));
			List<Integer> right = diffWaysToCompute(expression.substring(i+1));
			
			for(int leftNum : left) {
				for(int rightNum : right) { 
					int val = calculate(leftNum, rightNum, c);
					result.add(val);
				}
			}
		}
		
		if(result.isEmpty()) {
			result.add(Integer.parseInt(expression));
		}
		
		return result;
	}
	
	private int calculate(int num1, int num2, char operator) {
		int result = 0;
		
		switch(operator) {
		case '+' : result = num1 + num2;
			break;
		case '-' : result = num1 - num2;
			break;
		case '*' : result = num1 * num2;
			break;
		}
		return result;
	}
	
	
	private boolean isOperator(char operator) {
		return ((operator == '+') || (operator == '-') || (operator == '*'));
	}
}

