package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class _7662 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int k = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> pq = new TreeMap<>();
			
			while(k-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String id = st.nextToken();
				int n = Integer.parseInt(st.nextToken()); 
				if(id.equals("I")) {
					
					pq.put(n, pq.getOrDefault(n, 0) + 1);
				} else if(id.equals("D") && pq.size() > 0) {
					
					int num = n == 1 ? pq.lastKey() : pq.firstKey();
					if(pq.put(num, pq.get(num) - 1) == 1) {
						pq.remove(num);
					}
				}
			}
			
			sb.append(pq.size() == 0 ? "EMPTY" : pq.lastKey() + " " + pq.firstKey()).append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
