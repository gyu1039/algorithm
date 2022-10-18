package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<t; i++) {
			char[] ox = br.readLine().toCharArray();
			
			int count = 0;
			int sum = 0;
			for(char c : ox) {
				
				if(c == 'O') {
					count++;
					sum += count;
				} else {
					count = 0;
				}
			}
			
			sb.append(sum);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
