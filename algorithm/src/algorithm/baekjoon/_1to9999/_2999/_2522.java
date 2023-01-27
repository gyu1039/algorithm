package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2522 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			
			for(int j=N-i; j>0; j--) {
				sb.append(" ");
			}
			
			for(int j=0; j<i; j++) {
				sb.append("*");
			}
			
			sb.append("\n");
		}
		
		for(int i=1; i<=N-1; i++) {
			
			for(int j=0; j<i; j++) {
				sb.append(" ");
			}
			
			for(int j=N-i; j>0; j--) {
				sb.append("*");
			}
			
			sb.append("\n");
		}

		
		System.out.println(sb);
	}

}
