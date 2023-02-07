package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10820 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = br.readLine();
		while(s != null && s.length() != 0) {
			int len = s.length();
			int[] arr = new int[4];
			for(int i=0; i<len; i++) {
				int n = (int)s.charAt(i);
				
				if(97 <= n && n <= 122) {
					arr[0]++;
				} else if(65 <= n && n <= 90) {
					arr[1]++;
				} else if(48 <= n && n <= 57) {
					arr[2]++;
				} else if(n == 32) {
					arr[3]++;
				}
			}
			
			for(int i=0; i<4; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			s = br.readLine();
		}
		
		System.out.println(sb);
	}
}
