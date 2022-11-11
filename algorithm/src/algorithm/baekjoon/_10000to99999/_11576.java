package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _11576 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		br.close();
		
		int d = 0;
		
		while(m-- > 0) {
			d += Integer.parseInt(st.nextToken()) * (int)Math.pow(A, m);
		}
		
		List<Integer> list = new ArrayList<>();
		while(d > 0) {
			list.add(d % B);
			d /= B;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=list.size() - 1; i>=0; i--) {
			sb.append(list.get(i)).append(" ");
		}
		
		System.out.println(sb);
	}
}
