package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10815 {
	
	static int[] ar;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ar = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			ar[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(ar);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(lowerBound(key)).append(" ");
		}
		
		System.out.println(sb);
	}
	
	private static int lowerBound(int key) {
		
		int lo = 0;
		int hi = ar.length-1;
		
		while(lo < hi) {
			
			int mid = (lo + hi) / 2;
			
			if(key < ar[mid]) {
				hi = mid - 1;
			} else if(key > ar[mid]) {
				lo = mid + 1;
			} else {
				return 1;
			}
		}
		
		return 0;
	}
}
