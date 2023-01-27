package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2753 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		
		int result = (year % 4 == 0) && ((year % 100 != 0) || (year % 400) == 0) ?
				1 : 0;
		
		System.out.println(result);
		

	}

}
