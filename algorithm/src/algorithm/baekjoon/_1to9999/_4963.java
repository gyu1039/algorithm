package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4963 {

	static int[][] graph;
	static boolean[][] isVisited;
	static int[] dx = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
	static int[] dy = {1, 1, 1, 0, 0, 0, -1, -1, -1};
	static int w;
	static int h;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st =  new StringTokenizer(br.readLine());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();

		while(w != 0 && h != 0) {

			graph = new int[h+1][w+1];
			isVisited = new boolean[h+1][w+1];

			for(int i=1; i<=h; i++) {
				st = new StringTokenizer(br.readLine());

				for(int j=1; j<=w; j++) {
					graph[i][j] = Integer.parseInt(st.nextToken());
				}
			}


			int cnt = 0;
			for(int i=1; i<=h; i++) {

				for(int j=1; j<=w; j++) {

					if(graph[i][j] == 1 && !isVisited[i][j]) {
						cnt += dfs(i, j);
					}
				}
			}

			sb.append(cnt).append("\n");
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
		}

		System.out.println(sb);
	}

	private static int dfs(int x, int y) {

		
		for(int i=0; i<9; i++) {

			int row = x + dx[i];
			int col = y + dy[i];

			if( (1 <= row && row <= h) &&
					(1 <= col && col <= w) &&
					graph[row][col] == 1 &&
					!isVisited[row][col]) {
				
				isVisited[row][col] = true;
				dfs(row, col);
			}
		}

		return 1;
	}
}
