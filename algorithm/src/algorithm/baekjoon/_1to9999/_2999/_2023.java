package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2023 {

	static BufferedWriter bw; 
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());

		dfs(2, 1);
		dfs(3, 1);
		dfs(5, 1);
		dfs(7, 1);
		
		bw.flush();
		br.close();
		bw.close();

	}

	static void dfs(int n, int digit) throws IOException {

		if(digit == N) {
			bw.write(n + "\n");
			return;
		}
		
		for(int i=1; i<=9; i+=2) {
			if(isPrime(n*10 + i)) {
				dfs(n*10 + i, digit+1);
			}
			
		}
	}

	static boolean isPrime(int n) {

		for(int i=3; i<=n/2; i+=2) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
