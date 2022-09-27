package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}

		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int num = 1;
		boolean result = true;
		
		for(int i=0; i<n; i++) {
			
			int su = A[i];
			
			if(su >= num) {
				
				while(su >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				
				stack.pop();
				sb.append("-\n");
			} else {
				
				int N = stack.pop();
				
				if(N > su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		
		if(result) {
			System.out.println(sb);
		}
	}
}