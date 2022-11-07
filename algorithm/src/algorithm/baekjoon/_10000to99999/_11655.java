	package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11655 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<len; i++) {
			char c = s.charAt(i);
			if(('a' <= c && c <= 'z')) {
				int n = c + 13 > (int)'z' ? (c+13) - 26: c + 13;
				sb.append((char)n);
			} else if(('A' <= c && c <= 'Z')) {
				int n = c + 13 > (int)'Z' ? (c+13) - 26: c + 13;
				sb.append((char)n);
			} else {
				sb.append(c);
			}
		}
		
		System.out.println(sb);
	}
}
