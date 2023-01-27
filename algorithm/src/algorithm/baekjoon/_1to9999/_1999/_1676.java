package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _1676 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int count = 0;
		
		while(N >= 5) {
			count += N / 5;
			N /= 5;
		}
		
		System.out.println(count);
		
	}

	static void anotherWay() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long fac = 1;

		BigInteger bi = new BigInteger(String.valueOf(fac));
		for(int i=1; i<=N; i++) {
			bi = bi.multiply(new BigInteger(String.valueOf(i)));
		}

		String s = bi.toString();
		int cnt = 0;
		int idx = s.length() - 1;
		while(s.charAt(idx) == '0') {
			cnt++;
			idx--;
		}

		System.out.println(cnt);

	}

}
