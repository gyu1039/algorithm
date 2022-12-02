package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2146unsolved {
	
	static int[][] land;
	static int[][] isVisited;
	static int N;
	static int[] dx = {0,0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	static Queue<Integer> q = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		land = new int[N+1][N+1];
		isVisited = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				land[i][j] = Integer.parseInt(st.nextToken()) - 1;
			}
		}
		
		int cnt = howManyIslandAreThere(1, 1);
	}

	private static int howManyIslandAreThere(int x, int y) {

		for(int i=0; i<4; i++) {
			
			int x1 = x + dx[i];
			int y1 = y + dy[i];
			
			if((1 <= x1 && x1 <= N) &&
					(1 <= y1 && y1 <= N)) {
				
			}
		}

		return 0;
	}
	
	
}
