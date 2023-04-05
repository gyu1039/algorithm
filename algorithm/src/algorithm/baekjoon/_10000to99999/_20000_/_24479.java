package algorithm.baekjoon._10000to99999._20000_;

import java.beans.Visibility;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _24479 {
	
	static PriorityQueue<Integer>[] graph;
	static int[] nthVisited;
	static int order = 1;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		graph = new PriorityQueue[N + 1];
		nthVisited = new int[N+1];
		
		int tmp = M;
		while(tmp-- > 0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(graph[u] == null) {
				graph[u] = new PriorityQueue<>();
			}
			
			if(graph[v] == null) {
				graph[v] = new PriorityQueue<Integer>();
			}
			
			graph[u].add(v);
			graph[v].add(u);
		}

		dfs(R);
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			sb.append(nthVisited[i]).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(int x) {
		
		nthVisited[x] = order++;
		
		while(graph[x] != null && graph[x].size() != 0) {
			
			int v = graph[x].poll();
			
			if(nthVisited[v] == 0) {
				dfs(v);
			}
		}
	}
}
