package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11057 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long[][] dp = new long[N+1][11];

		for(int i=0; i<10; i++) {
			dp[0][i] = 1;
		}

		for(int i=1; i<=N; i++) {

			for(int j=9; j>=0; j--) {

				dp[i][j] = (dp[i-1][j] + dp[i][j+1]) % 10007;
			}
		}

		System.out.println(dp[N][0]);
	}

}
