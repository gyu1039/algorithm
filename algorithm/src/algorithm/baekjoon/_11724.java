package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11724 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] graph = new int[1001][1001];
		int u, v;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			
			graph[u][v] = graph[v][u] = 1;
		}
		
		br.close();
		
		int result = 0;
		boolean[] visited = new boolean[1001];
		for(int i=1; i<=N; i++) {
			if(visited[i] == false) {
				dfs(N, i, visited, graph);
				result++;
			}
		}
		
		System.out.println(result);
	}

	private static void dfs(int N, int index, boolean[] visited, int[][] graph) {

		if(visited[index] == true) return;
		
		visited[index] = true;
		for(int i=1; i<=N; i++) {
			if(graph[index][i] == 1) {
				dfs(N, i, visited, graph);
			}
		}
		
	}
}
