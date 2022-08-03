package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberCardGame {

	BufferedReader br;
	
	public NumberCardGame() {}
	
	public NumberCardGame(BufferedReader br) {
		this.br = br;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] t = br.readLine().split(" ");
		int row = Integer.parseInt(t[0]);
		int col = Integer.parseInt(t[1]);
		
		NumberCardGame ncg = new NumberCardGame(br);
		
		int result = 0;
		for(int i=0; i<row; i++) {
			int min = ncg.getMinNumber(col) ;
			result = result > min ? result : min;
		}
		
		System.out.println(result);
		
		br.close();
	}
	
	public int getMinNumber(int col) throws IOException {
		
		int[] a = is(col);
		Arrays.sort(a);
		
		return a[0];
	}
	
	public int[] is(int col) throws IOException {
		
		String[] t = br.readLine().split(" ");
		
		int[] a = new int[col];
		
		int i=0;
		for(String s : t) {
			a[i++] = Integer.parseInt(s);
		}
		
		return a;
	}
}
