package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10991 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			
			for(int j=N-i; j>0; j--) {
				sb.append(" ");
			}
			for(int j=0; j<i; j++) {
				sb.append("* ");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
