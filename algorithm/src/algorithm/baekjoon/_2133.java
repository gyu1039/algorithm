package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2133 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[N+2];
		
		if(N % 2 == 1) {
			bw.write(0 + "\n");
			bw.flush();
			bw.close();
			return;
		}
		
		dp[0] = 1;
		dp[2] = 3;
		for(int i=4; i<=N; i+=2) {
			dp[i] = dp[i-2] * dp[2];
			for(int j = i - 4; j>=0; j-=2) {
				dp[i] += dp[j] * 2;
			}
		}
		
		bw.write(dp[N] + "\n");
		bw.flush();
		bw.close();
		
				
	}
}
