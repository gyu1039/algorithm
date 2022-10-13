package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1978 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		boolean[] primeNumbers = new boolean[1001];
		Arrays.fill(primeNumbers, true);
		primeNumbers[0] = primeNumbers[1] = false;
		
		for(int i=2; i<1001; i++) {
			
			for(int j=i*i; j<1001; j+=i) {
				primeNumbers[j] = false;
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(primeNumbers[n]) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
