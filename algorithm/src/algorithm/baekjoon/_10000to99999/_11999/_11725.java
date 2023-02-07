package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class _11725 {
	
	static List<Integer>[] graph;
	static int[] parentNodeOfNTh;
	static boolean[] isVisited;
	static Queue<Integer> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int tmp = N-1;
		
		graph = new ArrayList[N+1];
		parentNodeOfNTh = new int[N+1];
		isVisited = new boolean[N+1];
		q = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		while(tmp-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
//		dfs(1);
		bfs(1);
		
		StringBuilder sb = new StringBuilder();
		for(int i=2; i<N+1; i++) {
			sb.append(parentNodeOfNTh[i]).append("\n");
		}
		
		System.out.println(sb);
	}

	private static void bfs(int i) {
		
		q.add(i);
		isVisited[i] = true;
		
		while(q.size() > 0) {
			int n = q.poll();
			
			for(int e : graph[n]) {
				if(!isVisited[e]) {
					parentNodeOfNTh[e] = n;
					isVisited[e] = true;
					q.add(e);
				}
			}
		}
		
	}

	private static void dfs(int i) {
		
		isVisited[i] = true;
		
		for(int n : graph[i]) {
			if(!isVisited[n]) {
				parentNodeOfNTh[n] = i;
				dfs(n);
			}
		}
		
	}
	
	
}
