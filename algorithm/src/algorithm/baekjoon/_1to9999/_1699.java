package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1699 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] dp = new int[N+1];
		dp[1] = 1;


		for(int i=2; i<=N; i++) {

			dp[i] = dp[i-1] + 1;
			for(int j=1; j*j <= i; j++) {
				if(dp[i] > dp[i - j*j] + 1) {
					dp[i] = dp[i - j*j] + 1;
				}

			}
		}

		System.out.println(dp[N]);


	}

}
