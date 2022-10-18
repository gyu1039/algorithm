package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1427 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int[] n = new int[N.length()];
		
		for(int i=0; i<n.length; i++) {
			n[i] = N.charAt(i) - '0';
		}
		
		for(int i=0; i<n.length; i++) {
			
			int max = i;
			for(int j=i+1; j<n.length; j++) {
				if(n[j] > n[max]) {
					max = j;
				}
			}
			
			if(n[i] < n[max]) {
				int tmp = n[i];
				n[i] = n[max];
				n[max] = tmp;
			}
		}
		
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]);
		}
	}
}
