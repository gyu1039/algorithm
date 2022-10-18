package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

//		int[] tmp = new int[N];
//		mergeSort(tmp, arr, 0, N-1);
		Arrays.sort(arr);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int a : arr) {
			bw.write(a + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void mergeSort(int[] tmp, int[] arr, int start, int end) {
		
		if(end - start < 1) {
			return;
		}
		
		int mid = start + (end - start) / 2;
		
		mergeSort(tmp, arr, start, mid);
		mergeSort(tmp, arr, mid+1, end);
		
		for(int i=start; i<=end; i++) {
			tmp[i] = arr[i];
		}
		
		int k = start;
		int index1 = start;
		int index2 = mid + 1;
		
		while(index1 <= mid && index2 <= end) {
			
			if(tmp[index1] > tmp[index2]) {
				arr[k] = tmp[index2];
				k++;
				index2++;
		 	} else {
		 		arr[k] = tmp[index1];
		 		k++;
		 		index1++;
		 	}
		}
		
		while(index1 <= mid) {
			
			arr[k] = tmp[index1];
			k++;
			index1++;
		}
		
		while(index2 <= end) {
			arr[k] = tmp[index2];
			k++;
			index2++;
		}
	}
}
