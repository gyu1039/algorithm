package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _7576 {

	static int[][] graph;
	static boolean[][] isVisited;
	static int minimumDate;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int width;
	static int height;
	static Queue<Tomato> q;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		width = Integer.parseInt(st.nextToken());
		height = Integer.parseInt(st.nextToken());
		graph = new int[height + 1][width + 1];
		isVisited = new boolean[height + 1][width + 1];
		q = new LinkedList<>();

		for(int row=1; row<=height; row++) {
			st = new StringTokenizer(br.readLine());
			for(int col=1; col<=width; col++) {
				graph[row][col] = Integer.parseInt(st.nextToken());
			}
		}


		for(int row=1; row<=height; row++) {

			for(int col=1; col<=width; col++) {
				if(graph[row][col] == 1) {
					q.add(new Tomato(row, col, 0));
				}
			}
		}

		minimumDate += bfs();

		if(allTheTomatoesAreNotRipe()) {
			System.out.println(-1);
			return;
		}

		System.out.println(minimumDate);
		br.close();
	}


	private static boolean allTheTomatoesAreNotRipe() {

		for(int i=1; i<=height; i++) {
			for(int j=1; j<=width; j++) {
				if(graph[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}


	private static int bfs() {

		int day = 0;

		while(!q.isEmpty()) {

			Tomato cur = q.poll();
			isVisited[cur.getRow()][cur.getCol()] = true;

			for(int i=0; i<4; i++) {

				int r = dx[i] + cur.getRow();
				int c = dy[i] + cur.getCol();

				if((1 <= r && r <= height) && (1 <= c && c <= width)
						&& graph[r][c] == 0 && !isVisited[r][c]) {

					isVisited[r][c] = true;
					graph[r][c] = 1;
					q.add(new Tomato(r, c, cur.getDay()+1));
				}

			}

			day = cur.getDay();
		}

		return day;
	}

	static class Tomato {

		private int row;
		private int col;
		private int day;

		Tomato(int x, int y, int day) {
			this.row = x;
			this.col = y;
			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public int getRow() {
			return row;
		}

		public int getCol() {
			return col;
		}
	}
}
