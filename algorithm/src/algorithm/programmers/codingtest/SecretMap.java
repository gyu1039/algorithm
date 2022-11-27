package algorithm.programmers.codingtest;

public class SecretMap {

	public String[] solution(int n, int[] arr1, int[] arr2) {

		StringBuilder sb = new StringBuilder();
		String[] answer = new String[n];

		for(int i=0; i<n; i++) {
			
			int dec = arr1[i] | arr2[i];
			int comp = (1 << n-1);
			for(int j=0; j<n; j++) {
				if((dec & comp) == comp) {
					sb.append("#");
					comp >>>= 1;
			continue;
				}
				sb.append(" ");
				comp >>>=1;
			}
			answer[i] = sb.toString();
			sb = new StringBuilder();
		}

		return answer;
	}
}
