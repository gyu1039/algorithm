package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int[] dp = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(arr);
		
		dp[0] = arr[0];
		for(int i=1; i<N; i++) {
			dp[i] = dp[i-1] + arr[i];
		}
		
		int sum = 0;
		for(int i : dp) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	public static void sort(int[] arr) {
		
	}
}
