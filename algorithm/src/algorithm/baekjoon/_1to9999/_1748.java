package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1748 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String n = N + "";
		
		long answer = 0;
		for(long i=1; i<n.length(); i++) {
			answer += ((long)Math.pow(10, i-1) * 9) * i;
		}
		
		long s = (long)Math.pow(10, n.length() - 1);
		answer += n.length() * (N - s + 1); 
		
		System.out.println(answer);
	}
}
