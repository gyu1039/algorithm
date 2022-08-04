package algorithm.thisisthecodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UntilItReachesOne {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");

		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);

		int count = sol1(N, K);

		System.out.println(count);

	}

	public static int sol1(int N, int K) {

		int count = 0;

		while(N != 1) {

			if(N % K == 0) {
				N /= K;
				count++;
				continue;
			}

			if(N % K != 0) {
				N -= 1;
				count++;
			}
		}


		return count;
	}
	
	public static int sol2(int N, int K) {
		
		int result = 0;
		
		while(true) {
			
			int target = (N / K) * K;
			result += (N - target);
			N = target;
			
			if(N < K) {
				break;
			}
			
			result += 1;
			N /= K;
		}
		
		return result;
	}
}
