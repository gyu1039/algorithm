package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		way2();
	}

	public static void way1() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] progression = new int[n];

		for(int i=0; i<n; i++) {
			progression[i] = Integer.parseInt(br.readLine());
		}

		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();

		int num = 1;
		boolean result = true;

		for(int i=0; i<n; i++) {

			// 4 3 6 8 7 5 2 1
			// 1 2 5 3 4
			int cur = progression[i];

			if(num <= cur) {

				while(cur >= num) {
					stack.push(num++);
					sb.append("+\n");
				}

				stack.pop();
				sb.append("-\n");
			} else {

				int p = stack.pop();

				if(p > cur) {
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
	
	public static void way2() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int num = 1;
		boolean result = true;
		
		// 4 3 6 8 7 5 2 1
		// 1 2 5 3 4
		
		for(int i=0; i<n; i++) {
			
			int element = Integer.parseInt(br.readLine());
			
			if(element >= num) {
				
				while(element >= num) {
					s.add(num++);
					sb.append("+\n");
				}
				
				s.pop();
				sb.append("-\n");
			} else if(element < num) {
				
				int poped = s.pop();
				if(poped != element) {
					
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