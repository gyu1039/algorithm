package algorithm.thisisthecodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {

	
	public static void main(String[] args) throws IOException {
	
		System.out.println(60*60*24);
		solution();
	}
	
	public static void solution() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int H = Integer.parseInt(br.readLine());
		
		int count = 0;
	
		for(int h=0; h<=H; h++) {
			
			for(int m=0; m<60; m++) {
				
				for(int s=0; s<60; s++) {
					if(check(h, m, s)) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean check(int h, int m, int s) {
		
		if(h%10 == 3 || m%10==3 || m/10==3 || s%10==3 || s/10==3) {
			return true;
		}
		return false;
	}
}
