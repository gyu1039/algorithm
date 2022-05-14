package algorithm.leetcode;

import java.util.Stack;

public class DailyTemperatures {
	
	public int[] dailyTemperatures(int[] temperatures) {
		
		int cnt = temperatures.length;
		int[] answer = new int[cnt];
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i = 0; i<cnt; i++) {
			
			while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int diff = stack.pop();
				answer[diff] = i - diff;
			}
			
			stack.push(i);
		}
		
		return answer;
	}
}
