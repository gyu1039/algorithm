package algorithm.programmers.codingtest;

import java.util.Stack;

public class CraneClawMachine {

	public int solution(int[][] board, int[] moves) {

		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int len = board.length;
		
		int comp = 0;
		
		for(int move : moves) {
			
			for(int i=0; i<len; i++) {
				
				comp = board[i][move-1];
				if(comp != 0) {
					board[i][move-1] = 0;
					
					break;
				}
				
				comp = i == len-1 ? 0 : comp; 
			}
			
			
			if(comp != 0) {
				answer += pushDoll(stack, comp);
			}
			
		}
		
		return answer;
	}
	
	public int pushDoll(Stack<Integer> stack, int doll) {
		
		
		if(stack.isEmpty()) stack.push(doll);
		else {
			return comparingSameDoll(stack, doll);
		}
		
		return 0;
	}
	
	
	public int comparingSameDoll(Stack<Integer> stack, int doll) {
		
		if(stack.peek() == doll) {
			stack.pop();
			return 2;
		} else {
			stack.push(doll);
		}
		
		return 0;
	}
	
}
