package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1075 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		String s = N + "";
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(s.length() - 1, '0');
		sb.setCharAt(s.length() - 2, '0');
		
		N = Integer.parseInt(sb.toString());
		while(N % M != 0) {
			N++;
		}
		
		s = N + "";
		System.out.println(s.substring(s.length()-2));
	}
}
