package algorithm.programmers.codingtest;

public class HarshadNumber {
	
	public boolean solution(int x) {
        
		int sumOfDigits = 0;
		int tmp = x;
		
		while(tmp != 0) {
			sumOfDigits += (tmp % 10);
			tmp /= 10;
		}
        
        return x % sumOfDigits == 0;
    }
}
