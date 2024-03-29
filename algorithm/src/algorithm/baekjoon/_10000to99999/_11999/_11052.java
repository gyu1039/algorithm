package algorithm.baekjoon._10000to99999._11999;

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
		
		for(int i=1; i<=N; i++) {
			
			for(int j=1; j<=i; j++) {
				dp[i] = Math.max(dp[i], price[j] + dp[i-j]);
			}
		}
		
		System.out.println(dp[N]);
	}
}
