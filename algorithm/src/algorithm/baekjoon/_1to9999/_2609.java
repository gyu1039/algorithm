package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2609 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st =  new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int mul = A*B;
		
		if(B > A) {
			int tmp = B;
			B = A;
			A = tmp;
		}
		
		int Q, R;
		while(true) {
			Q = B;
			R = A % B;
			
			if(R == 0) {
				break;
			}
			
			A = Q;
			B = R;
			
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(Q + "\n");
		sb.append(mul / Q);
		
		System.out.println(sb);
	}
}
