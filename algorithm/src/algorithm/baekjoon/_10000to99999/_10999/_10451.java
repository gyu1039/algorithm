package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10451 {

	static int[] graph;
	static boolean[] isVisited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		while(testCase-- > 0) {
			int N = Integer.parseInt(br.readLine());
			graph = new int[N+1];
			isVisited = new boolean[N+1];

			StringTokenizer st = new StringTokenizer(br.readLine());

			int i=1;
			int tmp = N;
			while(tmp-- > 0) {

				int e = Integer.parseInt(st.nextToken());
				graph[i] = e;
				i++;
			}

			int cnt = 0;
			for(i=1; i<=N; i++) {

				if(!isVisited[i]) {
					cnt += dfs(i);
				}
			}

			sb.append(cnt).append("\n");
		}

		System.out.println(sb);
	}

	private static int dfs(int i) {

		isVisited[i] = true;
		int n = graph[i];
		
		if(!isVisited[n]) {
			dfs(n);
		}

		return 1;

	}
}
