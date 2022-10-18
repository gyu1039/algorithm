package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			int R = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int sLen = s.length();
			for(int j=0; j<sLen; j++) {
				
				for(int k=0; k<R; k++) {
					sb.append(s.charAt(j));
				}
				
			}
			
			result.append(sb.toString());
			result.append("\n");
		}
		
		System.out.println(result);
	}

}
