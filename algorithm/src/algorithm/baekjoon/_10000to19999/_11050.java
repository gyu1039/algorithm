package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11050 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int result = 1;
		
		for(int i=0; i<K; i++) {
			result *= (N-i);
		}
		
		for(int i=0; i<K; i++) {
			result /= (K-i);
		}
		
		System.out.println(result);
	}
}
