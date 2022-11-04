package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _1927 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			int n = Integer.parseInt(br.readLine());
			
			switch(n) {
			case 0:
				if(pq.size() == 0) {
					sb.append("0\n");
				} else {
					sb.append(pq.poll()).append("\n");
				}
				
				break;
			default:
				pq.add(n);
			}
			
		}
		
		System.out.println(sb);
	}
}
