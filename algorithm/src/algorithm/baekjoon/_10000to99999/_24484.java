package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _24484 {
	
	static int depth;
	static PriorityQueue<Integer>[] graph;
	static int[] nthVisited;
	static int[] nthDepth;
	static int order = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		graph = new PriorityQueue[N+1];
		nthVisited = new int[N+1];
		nthDepth = new int[N+1];
		Arrays.fill(nthDepth, -1);
		
		while(M-- > 0) {
			
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(graph[u] == null) {
				graph[u] = new PriorityQueue<>(Collections.reverseOrder());
			}
			
			if(graph[v] == null) {
				graph[v] = new PriorityQueue<>(Collections.reverseOrder());
			}
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
		dfs(R);
		
		long result = 0;
		for(int i=1; i<N+1; i++) {
			result += ((long)nthVisited[i] * nthDepth[i]);
		}
		
		System.out.println(result);
	}

	private static void dfs(int r) {
		
		nthDepth[r] = depth++;
		nthVisited[r] = order++;
		
		while(graph[r] != null && graph[r].size() > 0) {
			
			int n = graph[r].poll();
			if(nthVisited[n] == 0) {
				dfs(n);
			}
		}
		
		depth--;
	}
}
