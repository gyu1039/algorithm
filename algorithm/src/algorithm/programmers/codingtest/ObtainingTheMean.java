package algorithm.programmers.codingtest;

public class ObtainingTheMean {

	public double solution(int[] arr) {
		int sum = 0;
		for(int n : arr) {
			sum += n;
		}
        
        return sum / (double)arr.length;
    }
}
