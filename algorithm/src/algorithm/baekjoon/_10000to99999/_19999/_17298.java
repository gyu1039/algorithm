package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class _17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		way2();
		
	}
	
	public static void way1() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[A];
		for(int i=0; i<A; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] ans = new int[A];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for(int i=1; i<A; i++) {
			
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				ans[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.empty()) {
			ans[stack.pop()] = -1;
		}

		for(int i=0; i<A; i++) {
			bw.write(ans[i] + " ");
		}
		
		bw.write("\n");
		bw.flush();
	}
	
	public static void way2() throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		
		Stack<Integer> ansStack = new Stack<Integer>();
		Stack<Integer> tmpStack = new Stack<Integer>();

		for(int i=N-1; i>=0; i--) {
			
			int cur = Integer.parseInt(s[i]);

			while(!tmpStack.isEmpty()) {
				if(tmpStack.peek() > cur) {
					ansStack.add(tmpStack.peek());
					break;
				} else {
					tmpStack.pop();
				}
			}
			
			if(tmpStack.isEmpty()) {
				ansStack.add(-1);
			}
			
			tmpStack.add(cur);
		}
		
		while(!ansStack.isEmpty()) {
			bw.write(ansStack.pop() + " ");
		}
		
		bw.flush();
		bw.close();
		
	}

}
