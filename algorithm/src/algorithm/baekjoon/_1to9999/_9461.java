package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9461 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long[] dp = new long[101];
		
		dp[1] = dp[2] = dp[3] = 1;
		dp[4] = dp[5] = 2;
		dp[6] = dp[3] + dp[5];
		dp[7] = dp[2] + dp[6];
		dp[8] = dp[1] + dp[7];
		dp[9] = dp[4] + dp[8];
		dp[10] = dp[5] + dp[9];
		// n>10
		// dp[n] = dp[n-1] + dp[n-5]
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			if(dp[N] != 0) {
				sb.append(dp[N]);
				sb.append("\n");
				continue;
			}
			
			for(int j=11; j<=N; j++) {
				dp[j] = dp[j-1] + dp[j-5];
			}
			sb.append(dp[N]);
			sb.append("\n");
		}
	
		System.out.println(sb);
	}
}
