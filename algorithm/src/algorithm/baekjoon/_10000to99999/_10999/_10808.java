package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String s = br.readLine();
		int len = s.length();

		for(int i=0; i<len; i++) {
			arr[s.charAt(i) - 'a']++;
		}


		StringBuilder sb = new StringBuilder();
		for(int i=0; i<26; i++) {
			sb.append(arr[i]).append(" ");
		
		}

		System.out.println(sb);
	}
}
