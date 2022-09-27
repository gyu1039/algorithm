package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1253 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		int i=0;
		int j=1;
		int count = 0;
		
		for(int k=0; k<N; k++) {
			long candidate = nums[k];
			i = 0;
			j = N-1;
			while(i < j) {
				long tmp = nums[i] + nums[j]; 
				if(tmp == candidate) {
					if(i != k && j != k) {
						count++;
						break;
					} else if(i == k) {
						i++;
					} else if(j == k) {
						j--;
					}
					
				} else if(tmp < candidate) {
					i++;
				} else if(tmp > candidate) {
					j--;
				}
			}
		}
		
		System.out.println(count);

	}

}
