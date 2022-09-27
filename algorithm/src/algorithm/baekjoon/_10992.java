package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10992 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N-1; i++) {
			
			for(int j=N-i; j>0; j--) {
				sb.append(" ");
			}
			
			sb.append("*");
			
			for(int j=0; j<2*(i-1)-1; j++) {
				sb.append(" ");
			}
			
			if(i>1) {
				sb.append("*");
			}
			
			sb.append("\n");
		}
		
		for(int i=0; i<2*N-1; i++) {
			sb.append("*");
		}
		
		System.out.println(sb);
	}

}
