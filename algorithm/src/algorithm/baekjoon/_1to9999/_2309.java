package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2309 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] height = new int[9];
		int sum = 0;
		for(int i=0; i<9; i++) {
			height[i] = Integer.parseInt(br.readLine());
			sum += height[i];
		}
		
		Arrays.sort(height);
		int[] indexToExclude = new int[2];
		
		outer: for(int i=0; i<height.length-1; i++) {
			
			for(int j=i+1; j<height.length; j++) {
				if((sum - (height[i] + height[j])) == 100) {
					indexToExclude[0] = i;
					indexToExclude[1] = j;
					break outer;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<height.length; i++) {
			if(i == indexToExclude[0] || i == indexToExclude[1]) {
				continue;
			}
			sb.append(height[i]).append("\n");
		}
		
		System.out.println(sb);
		
	}
}
