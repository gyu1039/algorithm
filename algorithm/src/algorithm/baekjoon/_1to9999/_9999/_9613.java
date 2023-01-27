package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _9613 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] ar = new int[n];
			long sum = 0;
			
			for(int i=0; i<n; i++) {
				ar[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(ar);
			
			for(int i=0; i<n-1; i++) {
				
				for(int j=i+1; j<n; j++) {
					sum += gcd(ar[j], ar[i]);
				}
			}
			
			sb.append(sum).append("\n");
			
		}
		
		System.out.println(sb);
	}
	
	public static long gcd(long a, long b) {
		
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
		
	}
}
