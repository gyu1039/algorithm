package algorithm.programmers.codingtest;

public class ShareAPizza {

	public int solution(int n) {

		return n / 7 + (n % 7 != 0 ? 1 : 0);
	}
}
