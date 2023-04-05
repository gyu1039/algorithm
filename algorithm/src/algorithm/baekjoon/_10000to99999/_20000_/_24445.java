package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class _24445 {
	
	static List<Integer>[] graph;
	static int order = 1;
	static int[] nthVisited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
	
		graph = new ArrayList[N+1];
		nthVisited = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
		for(int i=1; i<=N; i++) {
			Collections.sort(graph[i], Collections.reverseOrder());
		}
		
		bfs(R);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			sb.append(nthVisited[i]).append("\n");
		}
		
		System.out.println(sb);
	}

	private static void bfs(int r) {
		
		nthVisited[r] = order++;
		Queue<Integer> q = new LinkedList<>();
		q.add(r);
		
		while(q.size() > 0) {
			
			int n = q.poll();
			
			for(int x : graph[n]) {
				
				if(nthVisited[x] == 0) {
					nthVisited[x] = order++;
					q.add(x);
				}
			}
		}
	}
}
