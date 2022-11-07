package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11004 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int[] nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
//		quickSort(nums, 0, N-1, K-1);
		Arrays.sort(nums);
		System.out.println(nums[K-1]);
	}
	
	public static void quickSort(int[] arr, int start, int end, int k) {
		
		if(start < end) {
			int pivot = partition(arr, start, end);
			
			if(pivot == k) {
				return;
			} else if(k < pivot) {
				quickSort(arr, start, pivot - 1, k);
			} else {
				quickSort(arr, pivot+1, end, k);
			}
		}
		
	}
	
	public static int partition(int[] arr, int start, int end) {
		
		int mid = (start + end) / 2;
		swap(arr, start, mid);
		int pivot = arr[start];
		int i = start, j = end;
		
		while(i < j) {
			while(pivot < arr[j]) {
				j--;
			}
			
			while(i<j && pivot >= arr[i]) {
				i++;
			}
		}
		
		swap(arr, i, j);
		
		arr[start] = arr[i];
		arr[i] = pivot;
		return i;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
