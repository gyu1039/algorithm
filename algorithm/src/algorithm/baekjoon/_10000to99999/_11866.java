package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _11866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Deque<Integer> deq = new ArrayDeque<>();
		
		for(int i=1; i<=N; i++) {
			deq.addLast(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<K-1; j++) {
				deq.addLast(deq.removeFirst());
			}
			
			if(i != N-1) {
				sb.append(deq.removeFirst()).append(", ");
			} else if(i == N-1) {
				sb.append(deq.removeFirst()).append(">");
			}
		}
		
		System.out.println(sb);
		
	}
}
