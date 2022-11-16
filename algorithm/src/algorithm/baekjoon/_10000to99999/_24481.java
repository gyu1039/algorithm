package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _24481 {

	static int depth;
	static List<Integer>[] graph;
	static int[] visited;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		graph = new ArrayList[N+1];
		visited = new int[N+1];
		
		Arrays.fill(visited, -1);
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(graph[u] == null) {
				graph[u] = new ArrayList<>();
			}
			
			if(graph[v] == null) {
				graph[v] = new ArrayList<>();
			}

			graph[v].add(u);
			graph[u].add(v);
		}
		
		for(int i=1; i<graph.length; i++) {
			
			if(graph[i] == null) {
				continue;
			}
			
			Collections.sort(graph[i]);
		}
		
		dfs(R);
		 
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			sb.append(visited[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void dfs(int v) {
		
		visited[v] = depth++;
		
		if(graph[v] == null) {
			return;
		}
		
		for(int n : graph[v]) {

			if(visited[n] == -1) {
				dfs(n);
			}
		}
		
		depth--;
	}
}
