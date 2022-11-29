package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2501 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		
		int cnt = 0;
		for(int i=1; i <= N/2; i++) {
			
			if(N % i == 0) {
				cnt++;
				if(M == cnt) {
					System.out.println(i);
					return;
				}
			}
		}
		
		if(cnt + 1 == M) {
			System.out.println(N);
		} else {
			System.out.println(0);
		}
		
		
	}
}
