package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1977 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = (int)Math.ceil(Math.sqrt(Integer.parseInt(br.readLine())));
		int N = (int)(Math.sqrt(Integer.parseInt(br.readLine())));
		
		if(M > N) {
			System.out.println(-1);
			return;
		}
		
		int min = M*M;
		int sum = 0;
		
		for(int i=M; i<=N; i++) {
			sum += i*i;
		}
		
		System.out.println(sum);
		System.out.println(min);
	}
	
	
}
