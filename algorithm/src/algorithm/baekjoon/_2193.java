package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2193 {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
		
		int N = 1;
		long[] dp = new long[N+2];
		dp[1] = 1;
		dp[2] = 1;
		

		for(int i=3; i<=N; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[N]);
	}

}
