package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11047 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		int idx = N-1;
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i] > K) {
				idx = i-1;
			}
		}
		
		int result = 0;
		while(K != 0) {
			
			int cnt = 0;
			if(K / arr[idx] > 0) {
				cnt = (K / arr[idx]);
				result += cnt;
				K -= (cnt * arr[idx]);
			}
			idx--;
			
		}
		
		System.out.println(result);
	}
}
