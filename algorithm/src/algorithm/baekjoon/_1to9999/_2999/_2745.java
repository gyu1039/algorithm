package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		int result = 0;
		int digit = 0;
		int len = N.length();
		
		for(int i=len-1; i>=0; i--) {
			char c = N.charAt(i);
			if(65 <= c && c <= 90) {
				result += (int)Math.pow(B, digit) * (c - 55);
			} else {
				result += (int)Math.pow(B, digit) * (c - '0');
			}
			digit++;
		}


		System.out.println(result);
	}
}
