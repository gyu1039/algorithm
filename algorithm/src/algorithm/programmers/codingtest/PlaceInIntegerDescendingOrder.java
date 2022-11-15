package algorithm.programmers.codingtest;

public class PlaceInIntegerDescendingOrder {
	
	public long solution(long n) {
		
		int[] digit = new int[10];
		
		while(n > 0) {
			digit[(int)(n % 10)]++;
			n /= 10;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=9; i>=0; i--) {
			
			while(digit[i] > 0) {
				sb.append(i);
				digit[i]--;
			}
		}
		
		return Long.parseLong(sb.toString());
	}
	
	public static void main(String[] args) {
		
	}
}
