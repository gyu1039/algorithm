package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		boolean[][] board = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			char[] row = br.readLine().toCharArray();
			
			for(int j=0; j<M; j++) {
				if(row[j] == 'W') {
					board[i][j] = true;
				} else if(row[j] == 'B') {
					board[i][j] = false;
				}
			}
		}
		
		int count = 65;
		
		for(int i=0; i<N-7; i++) {
			for(int j=0; j<M-7; j++) {
				count = Math.min(findMin(board, i, j), count);
			}
		}
		
		System.out.println(count);
	}
	
	public static int findMin(boolean[][] board, int x, int y) {
		
		int mustPainting = 0;
		boolean b = board[x][y];

		for(int i=x; i<x+8; i++) {
			
			for(int j=y; j<y+8; j++) {
				
				if(board[i][j] != b) {
					mustPainting++;
				}
				
				b = !b;
			}
			
			b = !b;
		}
		
		
		mustPainting = Math.min(mustPainting, 64-mustPainting);
		
		
		return mustPainting;
	}
}
