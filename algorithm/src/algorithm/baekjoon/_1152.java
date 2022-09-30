package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1152 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0;
		String t = br.readLine();
		result = t.equals(" ") ? 0 : 1;
		if(result != 0) {
			String[] s = t.trim().split(" ");
			result = s.length;
		}
		
		System.out.println(result);
	}
}
