package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1929 {

	public static void main(String[] args) throws IOException {
		
		final int MAX_CONDITION = 1_000_000;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] isPrime = new boolean[MAX_CONDITION+1];
		Arrays.fill(isPrime, true);
		
		isPrime[0] = isPrime[1] = false;
		for(int i=2; i*i <= MAX_CONDITION; i++) {
			
			if(isPrime[i]) {
				for(int j=i*i; j<=MAX_CONDITION; j+=i) {
					isPrime[j] = false;
				}
				
			}
		}
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=M; i<=N; i++) {
			if(isPrime[i]) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
