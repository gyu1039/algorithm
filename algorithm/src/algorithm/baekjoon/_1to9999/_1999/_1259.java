package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1259 {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		while(Integer.parseInt(s) != 0){
			String answer = "yes";
			
			int sLen = s.length();
			for(int i=0; i<sLen/2; i++) {
				if(s.charAt(i) != s.charAt(sLen-1-i)) {
					answer = "no";
					break;
				}
			}
			sb.append(answer + "\n");
			s = br.readLine();
		}
		
		System.out.println(sb);
	}
}
