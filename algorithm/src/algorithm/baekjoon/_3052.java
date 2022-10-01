package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] mod = new int[42];
		
		for(int i=0; i<10; i++) {
			mod[Integer.parseInt(br.readLine()) % 42]++;			
		}
		
		int result = 0;
		for(int i=0; i<42; i++) {
			if(mod[i] != 0) {
				result++;
			}
		}
		
		System.out.println(result);
	}
	
	public static void way2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<10; i++) {
			set.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(set.size());
		
		
	}
}
