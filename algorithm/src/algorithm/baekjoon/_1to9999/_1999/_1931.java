package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1931 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] meeting = new int[N][2];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			meeting[i][0] = s;
			meeting[i][1] = e;
		}
		
		Arrays.sort(meeting, (m1, m2) -> {
			return m1[1] > m2[1] ? 1 : 
				m1[1] == m2[1] ? m1[0] > m2[0] ? 1 :
					-1 : -1;
		});
		
		int count = 1;
		int[] comparison = meeting[0];
		for(int i=1; i<N; i++) {
			if(meeting[i][0] >= comparison[1]) {
				count++;
				comparison = meeting[i];
			}
		}
		
		System.out.println(count++);
	}
	
	
}
