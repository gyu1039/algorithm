package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2875 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);
		int K = Integer.parseInt(tmp[2]);
		
		int quotientOfN = N/2;
		int remainder = 0;
		int team = Math.min(quotientOfN, M);
		
		N -= team*2;
		M -= team;
		
		if(N > 0) {
			remainder += N;
			N = 0;
		} 
		if(M > 0) {
			remainder += M;
			M = 0;
		}
		
		if(remainder >= K) {
			System.out.println(team);
			return;
		}
		
		while(remainder < K) {
			team--;
			remainder += 3;
		}
		System.out.println(team);
	}
}
