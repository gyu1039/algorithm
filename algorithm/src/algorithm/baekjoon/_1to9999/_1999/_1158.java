package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _1158 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Deque<Integer> deq = new ArrayDeque<Integer>();
		for(int i=1; i<=N; i++) {
			deq.addLast(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(deq.size() > 1) {

			for(int i=0; i<K-1; i++) {
				deq.addLast(deq.removeFirst());
			}
			sb.append(deq.removeFirst()).append(", ");
		}
		
		sb.append(deq.removeFirst()).append(">");
		
		System.out.println(sb);
	}
}
