package algorithm.programmers.codingtest;

import java.util.Arrays;

public class HIndex {

	public static int solution(int[] citations) {

		int answer = 0;
        Arrays.sort(citations);
        int numberOfPapers = citations.length;
        for(int h=0; h<numberOfPapers; h++){
            int smaller = Math.min(citations[h], numberOfPapers-h);
            answer = Math.max(answer, smaller);
        }
        return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {0,2,4,5,6}));
	}
}
