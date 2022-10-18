package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1377 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Data[] arr = new Data[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = new Data(Integer.parseInt(br.readLine()), i);
		}
		
		Arrays.sort(arr);
		int max = 0;
		
		for(int i=0; i<N; i++) {
			if(max < arr[i].index - i) {
				max = arr[i].index - i;
			}
		}
		
		System.out.println(max + 1);
		
	}
	
	static class Data implements Comparable<Data> {
		
		int value;
		int index;
		
		public Data(int value, int index) {
			this.value = value;
			this.index = index;
		}
		
		@Override
		public int compareTo(Data o) {
			return this.value - o.value;
		}
	}
}

