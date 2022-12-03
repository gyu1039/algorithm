package algorithm.programmers.codingtest;

public class Trio {
	public int solution(int[] number) {
		int answer = 0;

		for(int i=0; i<number.length - 2; i++) {
			int a = number[i];

			for(int j=i+1; j<number.length-1; j++){
				int b = number[j];

				for(int k=j+1; k<number.length; k++) {
					if(a+b+number[k] == 0) {
						answer++;
					}
				}
			}
		}

		return answer;
	}
}
