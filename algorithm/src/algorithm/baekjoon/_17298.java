package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class _17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
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

}
