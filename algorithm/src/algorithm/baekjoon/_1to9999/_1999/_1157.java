package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {

	public static void main(String[] args) throws IOException {
		
		int[] count = new int[26];
		
		int c;
		while((c = System.in.read()) > 64) {
			
			if(c < 97) {
				count[c - 'A']++;
			} else {
				count[c - 'a']++;
			}
		};
		
		int max = count[0];
		char result = 'A';

		for(int i=1; i<26; i++) {
			
			if(max < count[i]) {
				max = count[i];
				result = (char) ('A' + i);
			} else if(max == count[i]) {
				result = '?';
			}
		}
		
		System.out.println(result);
	}

	public static void way2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] input = br.readLine().toUpperCase().toCharArray();
		int[] counting = new int[26];

		for(char c : input) {
			counting[c - 'A']++;
		}

		int max = counting[0];
		char result = 'A';

		for(int i=1; i<26; i++) {
			if(max < counting[i]) {
				result = (char) (i + 'A');
				max = counting[i];
			} else if(max == counting[i]) {
				result = '?';
			}
		}

		System.out.println(result);
	}
}
