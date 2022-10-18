package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2920 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[8];
		
		for(int i=0; i<8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		String result;
		switch(arr[0]) {
			case 1:
				result = "ascending";
				for(int i=1; i<8; i++) {
					if(arr[i-1] > arr[i]) {
						result = "mixed";
						break;
					}
				}
				break;
				
			case 8:
				result = "descending";
				for(int i=1; i<8; i++) {
					if(arr[i-1] < arr[i]) {
						result = "mixed";
						break;
					}
				}
				break;
				
			default:
				result = "mixed";
				break;
		}
		
		System.out.println(result);
		
	}

}
