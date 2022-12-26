package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _15990unsolved {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int division = 1_000_000_009;
		int testCase = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>(testCase);
		int max = 0;
		while(testCase-- > 0) {
			int n = Integer.parseInt(br.readLine());
			list.add(n);
			if(max < n) {
				max = n;
			}
		}
		
		int[] dp = new int[max+1];
		dp[1] = dp[2] = 1;
		dp[3] = 3;
		for(int i=4; i<=max; i++) {
			
		}
	}
}
