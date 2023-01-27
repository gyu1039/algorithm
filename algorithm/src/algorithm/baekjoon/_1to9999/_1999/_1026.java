package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] A = new int[N];
		int[] B = new int[N];
		boolean[] isUsed = new boolean[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int j=0; j<N; j++) {
			A[j] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int j=0; j<N; j++) {
			B[j] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		long s = 0;
		for(int i=0; i<N; i++) {
			
			int maxIdx = 0;
			for(int j=0; j<isUsed.length; j++) {
				if(!isUsed[j]) {
					maxIdx = j;
					break;
				}
			}
			
			for(int j=0; j<N; j++) {
				if(maxIdx != j && !isUsed[j] && B[maxIdx] < B[j]) {
					maxIdx = j;
				}
			}
			
			
			isUsed[maxIdx] = true;
			s += A[i] * B[maxIdx];
		}
		
		
		System.out.println(s);
	}
}
