package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _1620 {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[N+1];
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=1; i<=N; i++) {
			arr[i] = br.readLine();
			map.put(arr[i], i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			String s = br.readLine();
			if(map.containsKey(s)) {
				sb.append(map.get(s)).append("\n") ;
			} else {
				sb.append(arr[Integer.parseInt(s)]).append("\n");
			}
			
		}
		
		System.out.println(sb);
		
	}
}
