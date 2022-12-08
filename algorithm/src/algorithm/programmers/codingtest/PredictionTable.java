package algorithm.programmers.codingtest;

public class PredictionTable {
	
	public int solution(int n, int a, int b){

		if(a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		int answer = 0;

		do {
			int num = 1;
			answer++;
			for(int i=1; i<=n; i+=2) {

				if(i == a && i+1 == b) {
					return answer;
				} else if(i == a || i+1 == a) {
					a = num;

				} else if(i == b || i+1 == b) {
					b = num;                    

				}
				num++;
			}

			n /= 2;
		} while(n > 0);

		return answer;
	}
}
