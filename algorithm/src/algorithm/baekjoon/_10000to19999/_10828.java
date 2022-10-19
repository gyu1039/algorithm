package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				s.push(n);
				
			} else if(str.equals("pop")) {
				int tmp = s.isEmpty() == true ? -1 : s.pop();
				sb.append(tmp).append("\n");
				
			} else if(str.equals("size")) {
				sb.append(s.size()).append("\n");
				
			} else if(str.equals("empty")) {
				int tmp = s.isEmpty() == true ? 1 : 0;
				sb.append(tmp).append("\n");
				
			} else if(str.equals("top")) {
				int tmp = s.isEmpty() == true ? -1 : s.peek();
				sb.append(tmp).append("\n");
			}
			
		}
		
		System.out.println(sb);
	}
}
