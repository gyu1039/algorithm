package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1181 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] words = new String[N];
		for(int i=0; i<N; i++) {
			words[i] = br.readLine();
		}
		
		
		Arrays.stream(words).distinct()
		.sorted((s1, s2) -> {
			return s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length() ;
			})
		.forEach(s -> System.out.println(s));
		
	}

}
