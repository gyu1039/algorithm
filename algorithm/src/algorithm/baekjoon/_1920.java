package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Set<Integer> A = new HashSet<Integer>(N);	
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		
		int[] nums = new int[Integer.parseInt(br.readLine())];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<nums.length; i++) {
			if(A.contains(nums[i])) {
				sb.append(1);
				sb.append("\n");
			} else {
				sb.append(0);
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	public static int binarySearch(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length - 1;
		
		while(lo <= hi) {
			
			int mid = (lo + hi) / 2;
			
			if(key < arr[mid]) {
				hi = mid - 1;
			} else if(key > arr[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void way2() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			
			if(binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n');
			} else {
				sb.append(0).append('\n');
			}
		}
	}
}
