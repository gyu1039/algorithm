package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.zip.CheckedInputStream;

public class _1707 {

	static List<Integer>[] graph;
	static int[] colors;
	static boolean isBiPartite = true;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<testCase; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());

			graph = new ArrayList[V + 1];
			colors = new int[V + 1];
			isBiPartite = true;
			
			for(int j=1; j<=V; j++) {
				graph[j] = new ArrayList<>();
			}

			for(int j=0; j<E; j++) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());

				graph[u].add(v);
				graph[v].add(u);
			}

			int COLOR = 1; // RED = 1, BLUE = -1;
			
			for(int j=1; j<=V; j++) {
				

				if(colors[j] == 0) {
					dfs(j ,COLOR);
				}
				
				if(!isBiPartite) {
					break;
				}
			
			}
		
			sb.append(!isBiPartite ? "NO\n" : "YES\n");
		}
		
		System.out.println(sb);
	}

	private static void dfs(int V, int color) {

		colors[V] = color;
		
		for(int n : graph[V]) {
			
			if(colors[n] == color) {
				isBiPartite = false;
				return;
			}
			
			if(colors[n] == 0) {
 				dfs(n, -color);
			}
		}

	}
}
