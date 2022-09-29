package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11054 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 10
		// 1 5 2 1 4 3 4 5 2 1
		
		int[] rDP = new int[N];
		for(int i=0; i<N; i++) {
			
			rDP[i] = 1;
			for(int j=0; j<i; j++) {
				
				if(arr[j] < arr[i] && rDP[i] < rDP[j] + 1) {
					rDP[i] = rDP[j] + 1;
				}
			}		
		}
		
		int[] lDP = new int[N];
		for(int i=N-1; i>=0; i--) {
			
			lDP[i] = 1;

			for(int j=N-1; j>i; j--) {
			
				if(arr[i] > arr[j] && lDP[i] < lDP[j] + 1) {
					lDP[i] = lDP[j] + 1;
				}
			}
			
		}
		
		int[] dp = new int[N];
		for(int i=0; i<N; i++) {
			dp[i] = lDP[i] + rDP[i] - 1;
		}
		
		int result = dp[0];
		for(int i=1; i<N; i++) {
			if(result < dp[i]) {
				result = dp[i];
			}
		}
		
		System.out.println(result);
	}

}
