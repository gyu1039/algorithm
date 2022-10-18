package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10986{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long[] sumOfInterval = new long[N];
		long[] counter = new long[M];
		long result = 0;
		
		st = new StringTokenizer(br.readLine());
		sumOfInterval[0] = Long.parseLong(st.nextToken());
		
		for(int i=1; i<N; i++) {
			sumOfInterval[i] = sumOfInterval[i-1] + Long.parseLong(st.nextToken());
		}
		
		int remainder = 0;
		for(int i=0; i<N; i++) {
			remainder = (int) (sumOfInterval[i] % M);
			if(remainder == 0) {
				result += 1;
			} 
			counter[remainder] += 1;
		}
		
		for(long n : counter) {
			if(n>1) {
				result += n * (n-1) / 2;	
			}
		}
		
		System.out.println(result);
	}
}
