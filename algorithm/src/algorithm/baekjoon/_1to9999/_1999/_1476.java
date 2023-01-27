package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1476 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ar = br.readLine().split(" ");
		int E = Integer.parseInt(ar[0]);
		int S = Integer.parseInt(ar[1]);
		int M = Integer.parseInt(ar[2]);
		
		int e = 0;
		int s = 0;
		int m = 0;
		int year = 0;
		
		while(E != e || S != s || M != m) {
			
			
			// e = e == 15 ? 1 : e + 1;
			e = e % 15 + 1;
			s = s % 28 + 1;
			m = m % 19 + 1;
			
			year++;
		}
		
		System.out.println(year);
	}
}
