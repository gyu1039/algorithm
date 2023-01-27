package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1940 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] material = new int[N];
		
		for(int i=0; i<N; i++) {
			material[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(material);
		int count = 0;
		int i=0;
		int j=N-1;
		
		while(i < j) {
			
			int val = material[i] + material[j];
			
			if(val < M) {
				i++;
				
			} else if(val > M) {
				j--;
				
			} else if(val == M) {
				count++;
				i++;
				j--;
			}
			
		}
		
		System.out.println(count);

	}

}
