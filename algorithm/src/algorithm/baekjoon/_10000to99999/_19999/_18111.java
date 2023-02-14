package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class _18111 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[] ground = new int[257];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				ground[Integer.parseInt(st.nextToken())]++;
			}
		}
		
		int minHeight = -1;
		int maxHeight = -1;
		for(int i=0; i<257; i++) {
			if(minHeight == -1 && ground[i] != 0) {
				minHeight = i;
			} 
			
			if(maxHeight == -1 && ground[256 - i] != 0) {
				maxHeight = 256 - i;
			}
			
			if(minHeight != -1 && maxHeight != -1) {
				break;
			}
		}
		int minTime = Integer.MAX_VALUE;
		int largestHeight = 0;
		for(int height=minHeight; height<=maxHeight; height++) {
			
			int sec = 0;
			int inventory = B;

			for(int tmp=minHeight; tmp<=maxHeight; tmp++) {
				
				int dif = height - tmp;
				if(dif > 0) {
					sec += dif * ground[tmp];
					inventory -= dif * ground[tmp];
				} else if(dif < 0) {
					sec += (-dif * ground[tmp])*2;
					inventory += -dif * ground[tmp];
				}
			}
			
			if(inventory >= 0) {
				if(minTime >= sec) {
					minTime = sec;
					largestHeight = height;
				}
			}
			
		}
		
		System.out.println(minTime + " " + largestHeight);
		
	}
}
