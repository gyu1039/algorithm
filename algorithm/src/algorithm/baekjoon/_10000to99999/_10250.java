package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			// 6 12 6 -> 601 
			
			int R = N % H == 0 ? H : N%H;
			int Q = R == H ? N / H : N/H + 1;
			
			String tmp = Q < 10 ? "0" + Q : String.valueOf(Q);
			
			sb.append(R).append(tmp).append("\n");
		}
		
		System.out.println(sb);
		
	}
}
