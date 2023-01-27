package algorithm.baekjoon._1to9999._3999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3085 {
	
	static char[][] board;
	static int N;
	static int max;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new char[N][N];
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			for(int j=0; j<N; j++) {
				board[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0; i<N; i++) {
			
			for(int j=1; j<N; j++) {
				char tmp = board[i][j-1];
				board[i][j-1] = board[i][j];
				board[i][j] = tmp;

				arrCheck();

				tmp = board[i][j-1];
				board[i][j-1] = board[i][j];
				board[i][j] = tmp;
			}
		}
		
		for(int i=0; i<N; i++) {
			
			for(int j=1; j<N; j++) {
				char tmp = board[j-1][i];
				board[j-1][i] = board[j][i];
				board[j][i] = tmp;

				arrCheck();

				tmp = board[j][i];
				board[j][i] = board[j-1][i];
				board[j-1][i] = tmp;
			}
			
		}
		
		
		System.out.println(max);
	}

	private static void arrCheck() {
		
		for(int i=0; i<N; i++) {
			
			int count = 1;
			for(int j=1; j<N; j++) {
				
				if(board[i][j-1] == board[i][j]) {
					count++;
				} else {
					count = 1;
				}
				
				max = Math.max(count, max);
			}
		
		}
		
		
		for(int i=0; i<N; i++) {
			
			int count = 1;
			for(int j=1; j<N; j++) {
				
				if(board[j-1][i] == board[j][i]) {
					count++;
				} else {
					count = 1;
				}
				
				max = Math.max(count, max);
			}
		}
		
	}
}
