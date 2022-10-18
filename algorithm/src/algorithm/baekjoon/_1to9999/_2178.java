package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2178 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] s = new char[N][M];
		int[][]	dist = new int[N][M];

		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};

		Queue<Pair> q = new LinkedList<>();

		for(int i=0; i<N; i++){
			String line = br.readLine();
			for(int j=0; j<M; j++){
				s[i][j] = line.charAt(j);
				dist[i][j] = -1;    
			}
		}

		q.offer(new Pair(0,0));  
		dist[0][0] = 0; 

		while(!q.isEmpty()){
			Pair p = q.poll();

			for(int i=0; i<4; i++){
				int nX = p.getX() + dx[i];
				int nY = p.getY() + dy[i];

				if(nX < 0 || nX >= N || nY < 0 || nY >= M){
					continue;
				}
				if(s[nX][nY] == '0' || dist[nX][nY] != -1){
					continue;
				}

				q.offer(new Pair(nX, nY));
				dist[nX][nY] = dist[p.getX()][p.getY()] + 1;
			}
		}

		System.out.print(dist[N-1][M-1] + 1);

	}

	static class Pair {

		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}
}
