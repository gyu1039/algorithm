package algorithm.baekjoon._1to9999._7999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _7568 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] weight = new int[N];
		int[] height = new int[N];
		int[] rank = new int[N];
		
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			weight[i] = x;
			height[i] = y;
			rank[i] = 1;
		}
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<N; j++) {
				
				if(i == j) {
					continue;
				}
				
				if(weight[i] < weight[j] && height[i] < height[j]) {
					rank[i]++;
				}
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int n : rank) {
			sb.append(n).append(" ");
		}
		
		System.out.println(sb);
	}
}
