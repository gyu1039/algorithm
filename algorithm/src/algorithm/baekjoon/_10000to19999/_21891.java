package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _21891 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		char[] s = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		
		// 'A', 'C', 'G', 'T'
		char[] dna = {'A', 'C', 'G', 'T'};
		Map<Character, Integer> minNums = new HashMap<>();
		Map<Character, Integer> comp = new HashMap<>();
		
		for(int i=0; i<4; i++) {
			minNums.put(dna[i], Integer.parseInt(st.nextToken())); 
		}
		
		for(int i=0; i<P; i++) {
			comp.put(s[i], comp.getOrDefault(s[i], 0) + 1);
		}
		
		int result = 0;
		for(int i=0; i <S-P+1; i++) {
			
			if(comp.getOrDefault(dna[0], 0) >= minNums.getOrDefault(dna[0], 0) &&
					comp.getOrDefault(dna[1], 0) >= minNums.getOrDefault(dna[1], 0) && 
						comp.getOrDefault(dna[2], 0) >= minNums.getOrDefault(dna[2], 0) &&
								comp.getOrDefault(dna[3], 0) >= minNums.getOrDefault(dna[3], 0)) {
				
				result++;
			}
			
			if(i + P < S) {
				comp.put(s[i], comp.get(s[i]) - 1);
				comp.put(s[i + P], comp.getOrDefault(s[i + P], 0) + 1);
			}
			
		}
		
		System.out.println(result);
	}
}
