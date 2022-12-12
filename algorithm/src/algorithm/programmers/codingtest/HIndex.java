package algorithm.programmers.codingtest;

import java.util.Arrays;

public class HIndex {

	public static int solution(int[] citations) {

		Arrays.sort(citations);
		int numberOfPapers = citations.length;

		int[] counter = new int[citations[numberOfPapers-1]+1];
		for(int i=0; i<numberOfPapers; i++) {
			counter[citations[i]]++;
		}

		int remainder = 0;
		int answer = 0;
		for(int h=0; h<=citations[numberOfPapers-1]; h++) {
			if(h <= numberOfPapers - remainder &&
					remainder <= h) {
				answer = h;
			}
			remainder += counter[h];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {0,2,4,5,6}));
	}
}
