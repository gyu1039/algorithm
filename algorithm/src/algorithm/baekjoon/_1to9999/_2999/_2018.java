package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int count = 1;
		int startIndex = 1;
		int endIndex = 1;
		int sum = 1;
		
		while(endIndex < N) {
			if(sum == N) {
				count++;
				endIndex++;
                sum += endIndex;
			} else if(sum > N) {
				sum -= startIndex;
				startIndex++;
				
			} else if(sum < N) {
				endIndex++;
                sum += endIndex;
			}
		}
		
		System.out.println(count);
	}

}
