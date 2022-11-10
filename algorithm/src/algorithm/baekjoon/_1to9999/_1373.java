package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1373 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder(br.readLine());
		
		if(sb.length() % 3 == 1) {
			sb.insert(0, "00");
		} else if(sb.length() % 3 == 2) {
			sb.insert(0, "0");
		}
		
		int len = sb.length();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<len; i+=3) {
			int sum = 0;
			
			sum += (int)(sb.charAt(i) - '0') * 4;
			sum += (int)(sb.charAt(i+1) - '0') * 2;
			sum += (int)(sb.charAt(i+2) - '0') * 1;
			
			result.append(sum);
		}
		
		System.out.println(result);
		br.close();
	}
}
