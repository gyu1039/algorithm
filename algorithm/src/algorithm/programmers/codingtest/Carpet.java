package algorithm.programmers.codingtest;

public class Carpet {
	public int[] solution(int brown, int yellow) {

		int[] answer = new int[2];
		for(int height=1; height<=brown; height++) {

			if((yellow % height == 0) && (4 + (height+yellow/height)*2 == brown)) {
				answer[0] = yellow / height + 2;
				answer[1] = height + 2;
				break;
			}
		}
		return answer;
	}

	
}
