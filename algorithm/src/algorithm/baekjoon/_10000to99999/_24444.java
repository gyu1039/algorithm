package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class _24444 {
	
	static PriorityQueue<Integer>[] graph;
	static int[] nthVisited;
	static int order = 1;
	static Queue<Integer> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
	
		graph = new PriorityQueue[N+1];
		nthVisited = new int[N+1];
		q = new LinkedList<Integer>();
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(graph[u] == null) {
				graph[u] = new PriorityQueue<Integer>();
			}
			
			if(graph[v] == null) {
				graph[v] = new PriorityQueue<Integer>();
			}
			
			graph[v].add(u);
			graph[u].add(v);
		}
		
		bfs(R);
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<N+1; i++) {
			sb.append(nthVisited[i]).append("\n");
		}
		
		System.out.println(sb);
	}

	private static void bfs(int r) {
		
		nthVisited[r] = order++;
		q.add(r);
		
		while(q.size() > 0) {
			
			int n = q.poll();
			while(graph[n] != null && graph[n].size() > 0) {
				int e = graph[n].poll();
				
				if(nthVisited[e] != 0) {
					continue;
				}
				
				nthVisited[e] = order++;
				q.add(e);
			}
			
		}
		
	}
}
