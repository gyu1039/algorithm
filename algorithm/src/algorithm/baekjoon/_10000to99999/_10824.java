package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10824 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n1 = st.nextToken() + st.nextToken();
		String n2 = st.nextToken() + st.nextToken();
		
		System.out.println(Long.parseLong(n1) + Long.parseLong(n2));
	}
}
