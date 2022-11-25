package algorithm.programmers.codingtest;

public class NumericRepresentation {
	
	
	public int solution(int n) {
		int answer = 1;

		for(int i=1; i<=n/2; i++)  {

			int tmp=i;
			for(int j=i+1; tmp<n; j++) {
				tmp += j;
			}

			if(tmp == n) {
				answer++;
			}    
		}

		return answer;
	}
}
