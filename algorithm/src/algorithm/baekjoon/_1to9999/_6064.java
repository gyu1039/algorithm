package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _6064 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		while(testCase-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int result = x;
			int tmpY = x % N == 0 ? N : x % N;
			int lcm = M*N / gcd(M, N);
			while(y != tmpY && result <= lcm) {
				tmpY = (tmpY + M) % N;
				tmpY = tmpY == 0 ? N : tmpY;
				result += M;
			}

			sb.append(result <= lcm ? result : -1).append("\n");
		}

		br.close();
		System.out.println(sb);
	}

	static int gcd(int n1, int n2) {

		if(n1 < n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}

		if(n2 == 0) {
			return n1;
		}

		return gcd(n2, n1%n2);
	}
}
