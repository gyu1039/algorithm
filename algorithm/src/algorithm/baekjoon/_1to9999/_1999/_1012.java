package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _1012 {
	
	static List<int[]> list;
	static int[][] field;
	static boolean[][] visited;
	static int cnt;
	static int M;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			list = new ArrayList<>();
			field = new int[M][N];
			visited = new boolean[M][N];
			
			for(int j=0; j<K; j++) {
				StringTokenizer lo = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(lo.nextToken());
				int y = Integer.parseInt(lo.nextToken());
				list.add(new int[] {x, y});
				
				field[x][y] = 1;
			}
			
			for(int[] l : list) {
				if(!visited[l[0]][l[1]]) {
					dfs(l[0], l[1]);
					cnt += 1;
				}
			}
			sb.append(cnt).append("\n");
			cnt = 0;
		}
		
		System.out.println(sb);
	}
	
	static void dfs(int x, int y) {

				
		if(visited[x][y]) {
			return;
		}
		visited[x][y] = true;
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {-1, 0, 1, 0};
		
		for(int i=0; i<4; i++) {
			int nX = x + dx[i];
			int nY = y + dy[i];
			
			if(0 <= nX && nX < M && 0 <= nY && nY < N) {
				if(field[nX][nY] == 1) {
					dfs(nX, nY);
				}
			}
			
		}
		
		
	}
}

