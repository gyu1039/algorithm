package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2606 {

	static List<Integer>[] list;
	static boolean[] visited;
	static int cnt;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int pairN = Integer.parseInt(br.readLine());

		list = new ArrayList[n+1];
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
		}

		for(int i=0; i<pairN; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			list[a].add(b);
			list[b].add(a);
		}

		visited = new boolean[n+1];
		visited[1] = true;
		dfs(1);

		System.out.println(cnt);
	}

	public static void dfs(int c) {

		for(int i : list[c]) {

			if(!visited[i]) {
				visited[i] = true;
				cnt++;
				dfs(i);
			}
		}
	}


}
