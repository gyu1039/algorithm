 package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1912 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		long[] dp = new long[n+1];
		long max = arr[1];
		dp[1] = max;
		
		for(int i=2; i<=n; i++) {
			dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
			max = Math.max(dp[i], max);
		}
	 	
		System.out.println(max);
	}
}
