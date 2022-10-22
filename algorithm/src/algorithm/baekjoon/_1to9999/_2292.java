package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2292 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		int comp;
		for(int i=1; true; i++) {
			comp = 3 * (i - 1) * i + 1;
			if(comp >= N) {
				System.out.println(i);
				return;
			}
		}
	}
}
