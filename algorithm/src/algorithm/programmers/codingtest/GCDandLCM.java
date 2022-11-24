package algorithm.programmers.codingtest;

public class GCDandLCM {

	public int[] solution(int n, int m) {

		if(n < m) {
			int tmp = m;
			m = n;
			n = tmp;
		}
		int g = gcd(n, m);
		
		return new int[] {g, n*m/g};
	}

	public static int gcd(int q, int r) {

		if(r == 0) {
			return q;
		}

		return gcd(r, q%r);
	}
}
