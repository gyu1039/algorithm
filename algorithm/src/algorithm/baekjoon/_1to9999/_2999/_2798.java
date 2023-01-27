package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int result = 0;
		for(int i=0; i<N-2; i++) {
			int n1 = arr[i];
			
			for(int j=i+1; j<N-1; j++) {
				int n2 = arr[j];
				
				for(int k=j+1; k<N; k++) {
					
					int tmp = n1 + n2 + arr[k];
					if(tmp == M) {
						System.out.println(tmp);
						return;
					}
					
					if(tmp < M && result < tmp) {
						result = tmp;
					}
				}
			}
		}
		
		System.out.println(result);
	}
}
