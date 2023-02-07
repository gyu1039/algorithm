package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _11652 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(arr);
		
		int cnt = 1;
		int maxCnt = 1;
		int maxIdx = 0;
		
		for(int i=1; i<N; i++) {
			if(arr[i] == arr[i-1]) {
				cnt++;
			} else {
				cnt = 1;
			}
			
			if(cnt > maxCnt) {
				maxCnt = cnt;
				maxIdx = i;
			}
		}
		
		System.out.println(arr[maxIdx]);
	}
	
	
}
