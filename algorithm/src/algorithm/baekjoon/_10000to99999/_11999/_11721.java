package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11721 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		
		while(sb.length() > 10) {
			System.out.println(sb.substring(0, 10));
			sb.delete(0, 10);
		}
		
		System.out.println(sb);
	}

}
