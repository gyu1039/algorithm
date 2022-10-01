package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2908 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder a = new StringBuilder(st.nextToken()).reverse();
		StringBuilder b = new StringBuilder(st.nextToken()).reverse();
		
		String result;
		
		result = Integer.parseInt(a.toString()) > Integer.parseInt(b.toString()) 
				? a.toString() : b.toString();
		
		System.out.println(result);
	}
	
	public static void way2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[2];
		for(int i=0; i<2; i++) {
			String s = st.nextToken();
			num[i] = (s.charAt(2) - '0') * 100 + (s.charAt(1) - '0') * 10 + (s.charAt(0) - '0') * 1;
		}

		System.out.println(num[0] > num[1] ? num[0] : num[1]);
	}
}
