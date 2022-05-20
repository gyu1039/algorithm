package algorithm.leetcode;

public class ClimbingStairs {

	public int climbStairs(int n) {
		
		if(n <= 2) return n;
		
		int a = 0, b = 1;
		
		int sum = 0;
		
		while(n-- > 1) {
			sum = a + b;
			a = b;
			b = sum;
		}
		
		return sum;
	}
}
