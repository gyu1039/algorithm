package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11005 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(N > 0) {
			
			if(N % B >= 10) {
				sb.append((char)((N % B) + 55));
			} else {
				sb.append(N%B);
			}
			
			N /= B;
		}
		
		System.out.println(sb.reverse());
	}
}
