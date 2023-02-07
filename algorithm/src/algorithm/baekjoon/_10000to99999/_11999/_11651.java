package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _11651 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
			return a[1] > b[1] ? 1 : 
				a[1] == b[1] ? 
						a[0] > b[0] ? 1 : -1 : -1;
		});
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			pq.add(new int[] {x, y});
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			int[] tmp = pq.poll();
			sb.append(tmp[0] + " " + tmp[1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
