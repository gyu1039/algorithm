package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _4153 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		while(arr[0] != 0){
			
			
			Arrays.sort(arr);
			
			if(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
				sb.append("right").append("\n");
			} else {
				sb.append("wrong").append("\n");
			}
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<3; i++) {
				arr[i] = Integer.parseInt(st.nextToken()); 
			}
			
		}
		
		System.out.println(sb);
	}
}
