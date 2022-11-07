package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11689 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		long result = n;
		
		for(long p=2; p*p<=n; p++) {
			
			if(n % p == 0) {
				result = result - result / p;
				while(n % p == 0) {
					n /= p;
				}
			}
		}
		
		if(n > 1) {
			result = result - result / n;
		}
		
		System.out.println(result);
	}
}
