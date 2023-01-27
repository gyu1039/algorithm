package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9465 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[][] dp;
		int[][] matrix;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			
			int n = Integer.parseInt(br.readLine());
			matrix = new int[2][n+1];
			dp = new int[2][n+1];
			
			for(int k=0; k<2; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int j=1; j<=n; j++) {
					matrix[k][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			dp[0][1] = matrix[0][1];
			dp[1][1] = matrix[1][1];
			
			for(int k=2; k<=n; k++) {
				dp[0][k] = Math.max(dp[1][k-1], dp[1][k-2]) + matrix[0][k];
				dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2]) + + matrix[1][k];
			}
			
			sb.append(Math.max(dp[0][n], dp[1][n]));
			sb.append("\n");
		}

		System.out.println(sb);
	}

}
