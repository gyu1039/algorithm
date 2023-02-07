package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class _11724 {

	static List<Integer>[] graph;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		graph = new ArrayList[N+1];
		visited = new boolean[N+1];

		for(int i=1; i<=N; i++) {
			graph[i] = new ArrayList<>();
		}


		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph[v].add(u);
			graph[u].add(v);
		}

		br.close();

		int result = 0;
		for(int i=1; i<=N; i++) {
			
			if(!visited[i]) {
				result += bfs(i);
			}
		}
		

		System.out.println(result);
	}

	private static int bfs(int n) {

		Queue<Integer> q = new LinkedList<>();
		q.add(n); 
		visited[n] = true;
		
		while(q.size() > 0) {
			
			int e = q.poll();
			
			for(int x : graph[e]) {
				
				if(!visited[x]) {
					visited[x] = true;
					q.add(x);
				}
			}
		}
		
		
		return 1;
	}


}
