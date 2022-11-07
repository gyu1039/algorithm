package algorithm.programmers.codingtest;

public class TurnNaturalNumbersIntoArray {

	public static int[] solution(long n) {
        
		String s = String.valueOf(n);
		int[] answer = new int[s.length()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int) (n % 10);
			n /= 10L;
		}
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] test = solution(10_000_000_000L);
		
		for(int n : test) {
			System.out.println(n);
		}
	}
}
