package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _6588 {

	public static void main(String[] args) throws IOException, InterruptedException {

		boolean[] isPrime = new boolean[1_000_000];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for(int i=2; i*i<isPrime.length; i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<isPrime.length; j+=i) {
					isPrime[j] = false;
				}	
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n;
		while((n = Integer.parseInt(br.readLine())) != 0) {

			int j;
			for(j=3; j<n; j++) {
				if(isPrime[j] && isPrime[n-j]) {
					sb.append(n).append(" = ").append(j).append(" + ").append(n-j).append("\n");
					break;
				}
			}

			if(j==n) {
				sb.append("Goldbach's conjecture is wrong.\n");
			}
		}

		System.out.println(sb);

	}
}
