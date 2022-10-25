package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11052 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] price = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[N+1];
		int count = N;
		/* 
		 * 4 
		 * 1 5 6 7 -> 10
		 * 
		 * */
		for(int i=1; i<=N; i++) {
		
			if(i % N == 0) {
				dp[i] = (N / i) * price[i];
			}
			
			while(count != 0) {
				
				
			}
		}
		
		
	}
}
