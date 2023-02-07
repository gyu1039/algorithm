package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11653 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) {
			System.out.println();
			return;
		}
				
		StringBuilder sb = new StringBuilder();
		
		int i = 2;
		
		
		while(N > 1) {
			
			if(N % i == 0) {
				sb.append(i).append("\n");
				N /= i;
				i = 2;
				continue;
			}
			i++;
		}
		
		
		
		System.out.println(sb);
		
	}
}
