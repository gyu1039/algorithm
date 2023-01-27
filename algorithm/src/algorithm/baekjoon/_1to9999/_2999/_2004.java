package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2004 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int count5 = power(5, n) - power(5, n-m) - power(5, m);
		int count2 = power(2, n) - power(2, n-m) -power(2, m);
		
		
		System.out.println(Math.min(count5, count2));
	}
	
	public static int power(int base, int n) {
		
		int cnt = 0;
		while(n >= base) {
			cnt += n / base;
			n /= base; 
		}

		return cnt;
	}
	
}
