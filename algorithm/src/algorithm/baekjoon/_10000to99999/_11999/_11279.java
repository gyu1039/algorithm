package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class _11279 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				sb.append(pq.isEmpty() ? "0" : pq.poll()).append("\n");
			} else {
				pq.add(x);
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
