package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		bubbleSort();

	}

	public static void way1() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for(int i=0; i<N; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		for(int i=0; i<N; i++) {
			System.out.println(pq.poll());
		}
	}

	public static void bubbleSort() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];

		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i=1; i<N; i++) {

			for(int j=0; j<N-i; j++) {

				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
