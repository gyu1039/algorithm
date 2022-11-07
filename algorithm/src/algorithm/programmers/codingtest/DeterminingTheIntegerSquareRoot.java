package algorithm.programmers.codingtest;

public class DeterminingTheIntegerSquareRoot {

	public long solution(long n) {
		
		long r = (long)Math.sqrt(n); 
		long answer = 0;
		
		if(r*r == n) {
			answer = (r+1)*(r+1);
		} else {
			answer = -1;
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(Math.sqrt(144));
	}
}
