package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11055 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 10
		// 1 100 2 50 60 3 5 6 7 8
		int[] dp = new int[N];
		for(int i=0; i<N; i++) {
			
			dp[i] = arr[i];
			
			for(int j=0; j<i; j++) {
				
				if(arr[j] < arr[i] && dp[i] < dp[j] + arr[i] ) {
					dp[i] = dp[j] + arr[i];
				}
			}
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
