package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AChange {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int moneyToPay = 1000 - Integer.parseInt(br.readLine());
		int count = 0;
		int[] yens = {500, 100, 50, 10, 5, 1};
		
		for(int i=0; i<yens.length; i++) {
			count += moneyToPay / yens[i];
			moneyToPay %= yens[i];
		}
		
		System.out.println(count);
	}
	
}
