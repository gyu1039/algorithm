package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1212 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		
		int _0th = s.charAt(0) - '0';
		if(_0th == 0) {
			System.out.println(0);
			return;
		}
		
		String[] octal = {"000", "001", "010", "011", "100", "101", "110", "111"};
		
		StringBuilder sb = new StringBuilder();
		while(_0th > 0) {
			sb.append(_0th % 2);
			_0th /= 2;
		}
		sb.reverse();
		
		int len = s.length();
		for(int i=1; i<len; i++) {
			int n = s.charAt(i) - '0';
			sb.append(octal[n]);
		}
		
		System.out.println(sb);
	}
}
