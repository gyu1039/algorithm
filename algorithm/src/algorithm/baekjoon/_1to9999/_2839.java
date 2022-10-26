package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2839 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int tmp = N;
		int count = 0;
		
		while(tmp != 0) {
		
			if(tmp % 5 == 0) {
				count += tmp / 5;
				break;
			} 
			
			tmp -= 3;
			count++;
		}
		
		if(0 >= tmp) {
			count = N % 3 == 0 ? N / 3 : -1;
		}

		System.out.println(count);
	}
}
