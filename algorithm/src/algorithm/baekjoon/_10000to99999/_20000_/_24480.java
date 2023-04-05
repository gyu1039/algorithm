package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _24480 {

	static int[] nthVisited;
	static List<Integer>[] graph;
	static int order = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		nthVisited = new int[N+1];
		graph = new ArrayList[N+1];

		for(int i=1; i<=N; i++) {
			graph[i] = new ArrayList<>();
		}

		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int u = Integer.parseInt(st.nextToken());

			graph[v].add(u);
			graph[u].add(v);
		}

		for(int i=1; i<graph.length; i++) {
			Collections.sort(graph[i], Collections.reverseOrder());
		}

		dfs(R);

		StringBuilder sb = new StringBuilder();
		for(int i=1; i<nthVisited.length; i++) {
			sb.append(nthVisited[i]).append("\n");
		}

		System.out.println(sb);
	}

	public static void dfs(int v) {

		
		nthVisited[v] = order++;

		for(int n : graph[v]) {
			
			if(nthVisited[n] == 0) {
				dfs(n);
			}
		}
	}
}

