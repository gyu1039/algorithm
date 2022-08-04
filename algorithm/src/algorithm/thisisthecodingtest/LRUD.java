package algorithm.thisisthecodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LRUD {

	
	public static void main(String[] args) throws IOException {
		
		solution();
	}
	
	
	public static void solution() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] p = br.readLine().split(" ");
		
		int left = 1;
		int right = 1;
		for(String s : p) {
			
			switch(s) {
			case "R":
				if(right + 1 <= N) {
					right++;
				}
				break;
				
			case "L":
				if(right - 1 >= 1) {
					right--;
				}
				break;
				
				
			case "U":
				if(left -1 >= 1) {
					left--;
				}
				break;
				
			case "D":
				if(left + 1 <= N) {
					left++;
				}
				break;
			}
		}
		
		System.out.println(left + " " + right);
	}
}
