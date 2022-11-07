package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		final int CON = 10_000_000;
		int[] NArr = new int[CON * 2 + 1];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			NArr[Integer.parseInt(st.nextToken()) + CON]++;
		}
		
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			int c = NArr[Integer.parseInt(st.nextToken()) + CON];
			sb.append(c).append(" ");
		}
		
		System.out.println(sb);
	}
}
