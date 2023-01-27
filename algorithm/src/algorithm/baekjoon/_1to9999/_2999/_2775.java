package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2775 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		long[][] building = new long[14 + 1][14 + 1];
		for(int i=1; i<=14; i++) {
			building[0][i] = i;
		}
		
		for(int i=1; i<=14; i++) {
			for(int j=1; j<=14; j++) {
				building[i][j] = building[i][j-1] + building[i-1][j];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			sb.append(building[k][n]).append("\n");
			
		}
		
		System.out.println(sb);
		
	}
}
