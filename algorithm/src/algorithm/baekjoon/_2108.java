package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[8001];
		double sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = max;
		int mode = max;
		
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(br.readLine()); 
			sum += value;
			arr[value + 4000]++; 
			
			if(max < value) {
				max = value;
			}
			
			if(min > value) {
				min = value;
			}
		}
		
		int count = 0;
		int modeMax = 0;
		
		boolean flag = false;
		
		for(int i=min+4000; i<=max+4000; i++) {
			
			if(arr[i] > 0) {
				
				if(count < (N+1)/2) {
					count += arr[i];
					median = i - 4000;
				}
				
				if(modeMax < arr[i]) {
					modeMax = arr[i];
					mode = i - 4000;
					flag = true;
				} else if(modeMax == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		int avg = (int) (Math.round(sum / N));
		sb.append(avg).append("\n");
		sb.append(median).append("\n");
		sb.append(mode).append("\n");
		sb.append(max-min).append("\n");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
		
	}
}
