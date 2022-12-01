package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2110 {
	
	static int[] houses;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int C = Integer.parseInt(s[1]);
		
		houses = new int[N];
		
		for(int i=0; i<N; i++) {
			houses[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(houses);
		int lo = 1;
		int hi = houses[N-1] - houses[0] + 1;
		
		while(lo < hi) {
			
			int mid = (lo + hi) / 2;
			
			if(canInstall(mid) < C) {
				
				hi = mid;
			} else {
				
				lo = mid+1;
			}
			
		}
		
		System.out.println(lo - 1);
		
	}

	private static int canInstall(int distance) {
		
		int count = 1;
		int last = houses[0];
		
		for(int i=1; i<houses.length; i++) {
			
			if(houses[i] - last >= distance) {
				count++;
				last = houses[i];
			}
		}
		
		return count;
	}
}
