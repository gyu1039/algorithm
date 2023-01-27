package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2089 {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		if(N == 0) {
			System.out.println(0);
			return;
		}
		
		int base = -10;
		
		StringBuilder sb = new StringBuilder();
		
		while(N != 0) {
			int i = N % base;
			N /= base;
			System.out.println("N : " + N + ", i: " + i);
			
			if(i<0) {
				i += Math.abs(base);
				N++;
				System.out.println("changed N: " + N + ", Changed i: +  " + i);
			}
			sb.append(i);
		}
		
		System.out.println(sb.reverse());
	}
}
