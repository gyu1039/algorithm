package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10610 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();
		char[] ar = n.toCharArray();
		
		int isMultipleOf3 = 0;
		for(char c : ar) {
			isMultipleOf3 += c - '0';
		}
		if(!n.contains("0") || isMultipleOf3 % 3 != 0) {
			System.out.println(-1);
			return;
		}
		
		Arrays.sort(ar);
		StringBuilder sb = new StringBuilder();
		for(int i=ar.length-1; i>=0; i--) {
			sb.append(ar[i]);
		}
		
		System.out.println(sb.toString());
	}
	
	
}
