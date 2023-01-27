package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1074 {
	
	static int N, r, c, result;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		backTracking((int)Math.pow(2, N), 0, 0);
		
	}
	
	public static void backTracking(int n, int row, int col) {

		if(n == 1) {
			System.out.println(result);
			return;
		}
		
		int nextN = n / 2; 
		if(r < row + nextN && c < col + nextN) {
			backTracking(nextN, row, col);
		}
		
		if(r < row + nextN && c >= col + nextN) {
			result += ((n * n) / 4);
			backTracking(nextN, row, col + nextN);
		}
		
		if(r >= row + nextN && c < col + nextN) {
			result += ((n * n) / 4) * 2;
			backTracking(nextN, row + nextN, col);
		}
		
		if(r >= row + nextN && c >= col + nextN) {
			result += ((n * n) / 4) * 3;
			backTracking(nextN, row + nextN, col + nextN);
		}
		
		
	}
}
