package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1463 {

	static int[] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		dp = new int[N+1];
		System.out.println(topDown(N));
	}
	
	
	public static int topDown(int n) throws NumberFormatException, IOException {

		if(n == 1) {
			return 0;
		}
		
		if(dp[n] > 0) {
			return dp[n];
		}
		
		dp[n] = topDown(n-1) + 1;
		if(n % 3 == 0) {
			int comp = topDown(n/3) + 1;
			if(dp[n] > comp) {
				dp[n] = comp;
			}
			
		} 
		
		if(n % 2 == 0) {
			int comp = topDown(n/2) + 1;
			if(dp[n] > comp) {
				dp[n] = comp;
			}
		} 
		
		return dp[n];
	}
	
	public static void bottomUP() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N+1];
		
		for(int i=2; i<=N; i++) {
			
			dp[i] = dp[i-1] + 1;
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			}
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
		}
		
		System.out.println(dp[N]);
	}

}
