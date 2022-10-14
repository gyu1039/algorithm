package algorithm.baekjoon;

import java.io.*;

public class _15829 {

	public static void main(String[] args) throws IOException {

		final int r = 31;
		final int M = 1234567891;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		long result = 0;
		long e= 1;
		for(int i=0; i<L; i++) {
			int t = s.charAt(i) - 'a' + 1;
		
			result = result + t * e % M;
			e = e * r % M;
			
		}
		
		System.out.println(result % M);
	}
}
