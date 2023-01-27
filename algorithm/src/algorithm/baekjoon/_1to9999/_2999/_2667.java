package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class _2667 {
	
	static int[][] graph;
	static boolean[][] isVisited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int N;
	static int theNumberOfHouse;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
	
		graph = new int[N+1][N+1];
		isVisited = new boolean[N+1][N+1];
		
		int r=1;
		int tmp = N;
		while(tmp-- > 0) {
			char[] s = br.readLine().toCharArray();
			
			for(int i=1; i<=N; i++) {
				graph[r][i] = s[i-1] - '0';
			}
			r++;
		}
		
		List<Integer> list = new ArrayList<>();	
		int cnt = 0;
		
		for(int row=1; row<=N; row++) {
			
			for(int col=1; col<=N; col++) {
				
				if(graph[row][col] == 1 && !isVisited[row][col]) {
					isVisited[row][col] = true;
					theNumberOfHouse++;
					cnt += dfs(row, col);
					
					list.add(theNumberOfHouse);
					theNumberOfHouse = 0;
				}
				
			}
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		sb.append(cnt).append("\n");
		for(int n : list) {
			sb.append(n).append("\n");
		}
		
		System.out.println(sb);
		
	}

	private static int dfs(int row, int col) {
		
		 for(int i=0; i<4; i++) {
			 
			 int x = dx[i] + row;
			 int y = dy[i] + col;
			 
			 if((1 <= x && x <= N) &&
					 (1 <= y && y <= N) && 
					 graph[x][y] == 1 &&
					 	!isVisited[x][y]) {
					  
				 theNumberOfHouse++;
				 isVisited[x][y] = true;
				 dfs(x, y);
			 }
			 
		 }
		 
		 return 1;
		
	}
}
