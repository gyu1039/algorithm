package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2331 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		List<Long> list = new ArrayList<>();
		list.add((long)A);
		
		while(true) {
			long tmp = list.get(list.size() - 1);
			long n = 0;
			
			while(tmp != 0) {
				
				n += (long)Math.pow(tmp % 10, P);
				tmp /= 10;
			}
			
			
			if(list.contains(n)) {
				int result = list.indexOf(n);
				System.out.println(result);
				break;
			}
			
			list.add(n);
		}
	}
	
}
