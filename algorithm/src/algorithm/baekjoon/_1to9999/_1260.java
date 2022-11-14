package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1260 {

	static StringBuilder sb; 
	static int[][] graph;
	static int N, M, V;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		sb = new StringBuilder();
		graph = new int[N+1][N+1];

		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			graph[n][m] = graph[m][n] = 1;
		}

		dfs(V, new boolean[N+1]);
		sb.append("\n");
		bfs(V, new boolean[N+1], new LinkedList<Integer>());

		System.out.println(sb);
	}


	public static void dfs(int v, boolean[] visited) {

		visited[v] = true;
		sb.append(v).append(" ");

		for(int n=1; n<=N; n++) {
			if(graph[v][n] != 0 && !visited[n]) {
				dfs(n, visited);
			}
		}
	}

	public static void bfs(int v, boolean[] visited, Queue<Integer> q) {

		q.add(v);
		visited[v] = true;

		while(!q.isEmpty()) {

			v = q.poll();
			sb.append(v).append(" ");

			for(int i=1; i<=N; i++) {
				if(graph[v][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
