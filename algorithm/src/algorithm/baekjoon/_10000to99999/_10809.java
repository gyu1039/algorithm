package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] s = br.readLine().toCharArray();
		int[] letter = new int[26];
		
		for(int i=0; i<26; i++) {
			letter[i] = -1;
		}
		
		for(int i=0; i<s.length; i++) {
			if(letter[s[i] - 'a'] == -1) {
				letter[s[i] - 'a'] = i;
			}
					
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<26; i++) {
			sb.append(letter[i]);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}
	
}
