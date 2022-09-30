package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		long mul = A * B * C;
		
		char[] charArray = String.valueOf(mul).toCharArray();
		int[] count = new int[10];
		
		for(char c : charArray) {
			count[c - '0']++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(count[i]);
		}
	}
}
