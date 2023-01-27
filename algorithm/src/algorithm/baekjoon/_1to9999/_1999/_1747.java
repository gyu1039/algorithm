package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1747 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int i=N; true; i++) {

			if(checkPalindrome(i) && isPrime(i)) {
				System.out.println(i);
				break;
			}
		}

	}

	private static boolean checkPalindrome(int n) {
		
		int temp = n;
		int reverse = 0;
		
		while (temp > 0) {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		}
		return n == reverse;
	}

	private static boolean isPrime(int n) {
		
		if (n == 1) return false;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}	

	public static void way2() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		boolean[] isPrime = new boolean[100_000_000];
		Arrays.fill(isPrime, true);

		isPrime[0] = isPrime[1] = false;
		int sq = (int)Math.sqrt(isPrime.length);
		for(int i=2; i<sq; i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<isPrime.length; j+=i) {
					isPrime[j] = false;
				}
			}
		}

		for(int i=N; i<isPrime.length; i++) {

			if(isPrime[i]) {

				String s = String.valueOf(i);
				boolean flag = true;
				for(int j=0; j<s.length()/2; j++) {
					if(s.charAt(j) != s.charAt(s.length() - 1 - j)) {
						flag = false;
						break;
					} 				
				}

				if(flag) {
					System.out.println(s);
					return;
				}
			}
		}

	}
}
