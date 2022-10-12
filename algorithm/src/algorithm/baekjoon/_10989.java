package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		radixSort(arr, 5);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<N; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
		bw.close();
	}

	private static void radixSort(int[] arr, int maxSize) {

		int[] tmp = new int[arr.length];
		int cipher = 1;
		int count = 0;
		
		while(count != maxSize) {
			
			int[] bucket = new int[10];
		
			for(int i=0; i<arr.length; i++) {
				bucket[(arr[i] / cipher) % 10]++;
			}
			
			for(int i=1; i<10; i++) {
				bucket[i] += bucket[i-1];
			}
			
			for(int i=arr.length-1; i>=0; i--) {
				tmp[bucket[(arr[i] / cipher) % 10] - 1] = arr[i];
				bucket[(arr[i] / cipher) % 10]--;
			}
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = tmp[i];
			}
			
			cipher *= 10;
			count++;
		}
		
	}
}
