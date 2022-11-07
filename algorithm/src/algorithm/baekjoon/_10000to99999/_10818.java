package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			if(n > max) {
				max = n;
			}
			
			if(n < min) {
				min = n;
			}
		}
		
		System.out.printf("%d %d", min, max);

	}

}
