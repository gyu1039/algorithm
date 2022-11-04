package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1934 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
	
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A < B) {
				int tmp = B;
				B = A;
				A = tmp;
			}
			
			int gcd = euclidean(A, B);
			sb.append(A*B/gcd).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static int euclidean(int a, int b) {
	
		
		while(b != 0) {
			int tmp = b;
			b = a%b;
			a = tmp;
		}
		
		return a;
	}
}
