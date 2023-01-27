package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1850 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		if(B > A) {
			long tmp = B;
			B = A;
			A = tmp;
		}
		
		while(B != 0) {
			
			long tmp = B;
			B = A%B;
			A = tmp;
		}
	
		
		System.out.println("1".repeat((int)A));
		
	}
}
