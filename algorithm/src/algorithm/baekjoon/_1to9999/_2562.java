package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int value = 0;
		int index = 0;
		for(int i=0; i<9; i++) {
			
			int tmp = Integer.parseInt(br.readLine());
			if(tmp > value) {
				value = tmp;
				index = i+1;
			}
		}

		System.out.printf("%d\n%d", value, index);
	}

}
