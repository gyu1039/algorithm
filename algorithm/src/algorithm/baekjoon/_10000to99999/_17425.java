package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _17425 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		long[] cumulativeSum = new long[1_000_000 + 1];
		long[] arr = new long[cumulativeSum.length];
		
		Arrays.fill(arr, 1);
		
		for(int i=2; i<arr.length; i++) {
			for(int j=1; i*j<arr.length; j++) {
				arr[i*j] += i;
			}
			
		}
		
		for(int i=1; i<arr.length; i++) {
			cumulativeSum[i] = cumulativeSum[i-1] + arr[i];
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<testCase; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(cumulativeSum[n]).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
}
