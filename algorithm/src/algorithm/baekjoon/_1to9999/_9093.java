package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9093 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(testCase-- > 0) {
			String s = br.readLine();
			for(String word : s.split(" ")) {
				for(int i=word.length()-1; i>=0; i--) {
					sb.append(word.charAt(i));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
