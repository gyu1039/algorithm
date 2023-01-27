package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2011 {

	
	public static void main(String[] args) throws IOException {

		final int divisor = 1_000_000;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String code = br.readLine();
		
		int len = code.length();		
		int[] dp = new int[len+1];
		char[] ch = new char[len+1];
		
		for(int i=1; i<=len; i++) {
			ch[i] = code.charAt(i-1);
		}
		
		if(ch[1] == '0') {
			System.out.println(0);
			return;
		} else {
			dp[1] = 1;
		}
		
		dp[0] = 1;
		for(int i=2; i<=len; i++) {
			
			if('1' <= ch[i] && ch[i] <= '9') {
				dp[i] = dp[i-1];
			}
			
			int num = (ch[i-1] - '0') * 10 + (ch[i] - '0');
			if(10 <= num && num <= 26) {
				dp[i] += (dp[i-2] % divisor);
				dp[i] %= divisor;
			}
		}
		
		System.out.println(dp[len]);
	}
	
}

