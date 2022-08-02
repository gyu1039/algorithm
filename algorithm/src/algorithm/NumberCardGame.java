package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberCardGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] t = br.readLine().split(" ");
		int row = Integer.parseInt(t[0]);
		int col = Integer.parseInt(t[1]);
		
		NumberCardGame ncg = new NumberCardGame();
		
		int result = 0;
		for(int i=0; i<row; i++) {
			int min = ncg.getMinNumber(col, br) ;
			result = result > min ? result : min;
		}
		
		System.out.println(result);
		
		br.close();
	}
	
	public int getMinNumber(int col, BufferedReader br) throws IOException {
		
		int[] a = is(col, br);
		Arrays.sort(a);
		
		return a[0];
	}
	
	public int[] is(int col, BufferedReader br) throws IOException {
		
		String[] t = br.readLine().split(" ");
		
		int[] a = new int[col];
		
		int i=0;
		for(String s : t) {
			a[i++] = Integer.parseInt(s);
		}
		
		return a;
	}
}
