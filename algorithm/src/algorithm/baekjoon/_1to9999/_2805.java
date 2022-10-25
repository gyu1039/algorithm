package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2805 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] woods = new int[N];
		int lo = 0, hi=0;
		
		for(int i=0; i<N; i++) {
			woods[i] = Integer.parseInt(st.nextToken());
			
			if(hi < woods[i]) {
				hi = woods[i];
			}
		}
		
		int cutterHeight = 0;
		while(lo < hi) {
			
			long woodHeight = 0;
			cutterHeight = (lo + hi) / 2;
			
			for(int h : woods) {
				if(h - cutterHeight > 0) {
					woodHeight += (h - cutterHeight);
				}
			}

			if(woodHeight >= M) {
				lo = cutterHeight + 1;
			} else {
				hi = cutterHeight;
			}
			
			
		}
		
		System.out.println(lo - 1);
		
	}
}