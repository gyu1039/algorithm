package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		final String devil = "666";
		final int condi = 10_000;

		String[] arr = new String[condi + 1];
		arr[1] = devil;
		int index = 2;
		for(int i=667; i<Long.MAX_VALUE; i++) {

			String tmp = String.valueOf(i);
			if(tmp.contains(devil)) {
				arr[index] = tmp;
				index++;
			}

			if(index > condi) {
				break;
			}

		}

		System.out.println(arr[N]);


	}
	
	public static void way2() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int n;
		
		for(int i=666; i<Integer.MAX_VALUE; i++) {
			n = i;
			while(n != 0) {
				if(n % 1000 == 666) {
					cnt++;
					break;
				}
				n /= 10;
			}
			
			if(cnt == N) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
