package algorithm.programmers.codingtest;

public class NNumbersSpacedByX {
	
	public long[] solution(int x, int n) {
		
		long[] result = new long[n];
		result[0] = x;
		for(int i=1; i<n; i++)  {
			result[i] = result[i-1] + x;
		}
		
		return result;
	}
}
