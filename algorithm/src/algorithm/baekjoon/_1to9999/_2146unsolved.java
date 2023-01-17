package algorithm.baekjoon._1to9999;

import javax.swing.text.Position;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2146unsolved {
	
	static int[][] land;
	static boolean[][] isVisited;
	static int N;
	static int[] dy = {1, 0, -1, 0};
	static int[] dx = {0, 1, 0, -1};
	static Queue<Position> q = new LinkedList<>();
	static final int LAND = 1;
	static int Identification = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		land = new int[N+1][N+1];
		isVisited = new boolean[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				land[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {

				if(land[i][j] == LAND) {
					bfs(i, j);
				}
			}
		}

		int answer = 0;
		System.out.println(answer);
	}

	private static int bfs(int x, int y) {

		int count = 0;

		if(x < 0 || y < 0 || x > N || y > N) {
			return count;
		}

		for(int i=0; i<4; i++) {

			int a = x + dx[i];
			int b = y + dy[i];

			if(a < 0 || b < 0 || a > N || b > N) {
				continue;
			}

			if(land[a][b] == 0) {
				count = bfs(a, b);
			}
		}
		return count;
	}







}
