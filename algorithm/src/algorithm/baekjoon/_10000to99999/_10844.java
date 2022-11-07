package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10844 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		topDown();
	}
	
	static final int mod = 1_000_000_000;
	
	public static void topDown() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[N+1][10];
		
		for(int i=1; i<10; i++) {
			dp[1][i] = 1L;
		}
		
		long result = 0;
		for(int i=0; i<10; i++) {
			result += rec(N, i, dp);
		}
		
		System.out.println(result % mod);
	}
	
	static long rec(int digit, int val, long[][] dp) {
		
		if(digit == 1) {
			return dp[digit][val];
		}
		
		if(dp[digit][val] == 0) {
			
			if(val == 0) {
				dp[digit][val] = rec(digit-1, 1, dp);
			} else if(val == 9) {
				dp[digit][val] = rec(digit-1, 8, dp);
			} else {
				dp[digit][val] = rec(digit-1, val-1, dp) + rec(digit-1, val+1, dp);
			}
		}
		
		return dp[digit][val] % mod;
	}
	
	public static void bottomUp() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		final int mod = 1_000_000_000;

		long[][] dp = new long[N+1][10];
		
		for(int i=1; i<10; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=N; i++) {

			for(int j=0; j<10; j++) {
				
				if(j==0) {
					dp[i][0] = dp[i - 1][1] % mod;
				} else if(j==9) {
					dp[i][9] = dp[i - 1][8] % mod;
				} else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
				}
				
			}
		}
		
		long result = 0;
		for(int i=0; i<10; i++) {
			result = (result + dp[N][i]) % mod;
		}
		
		System.out.println(result);
	}

}
