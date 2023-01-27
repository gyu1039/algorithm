package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class _1764 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		List<String> result = new ArrayList<>();
		Set<String> set = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			set.add(br.readLine());
		}
		
		for(int i=0; i<M; i++) {
			
			String s = br.readLine();
			if(set.contains(s)) {
				result.add(s);
			}
		}
		
		Collections.sort(result);
		int cnt = result.size();
		
		sb.append(cnt).append("\n");
		for(int i=0; i<result.size(); i++) {
			sb.append(result.get(i)).append("\n");
		}
		System.out.println(sb);
	}
}
