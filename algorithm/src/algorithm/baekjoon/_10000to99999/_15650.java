package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _15650 {
	
	static boolean[] isVisited;
	static List<Integer> list;
	static int N;
	static int M;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		N = Integer.parseInt(tmp[0]);
		M = Integer.parseInt(tmp[1]);
		
		isVisited = new boolean[N+1];
		list = new ArrayList<>(N);
		sb = new StringBuilder();
		
		backtracking(0, 0);
		
		System.out.println(sb);
	}

	private static void backtracking(int count, int prev) {

		if(count == M) {
			for(int n : list) {
				sb.append(n).append(" ");
			}
			sb.append("\n");
			
			return;
		}
	
		for(int i=1; i<=N; i++) {
			
			if(isVisited[i] || i < prev) {
				continue;
			}
			isVisited[i] = true;
			list.add(i);
			backtracking(count+1, i);
			list.remove(list.size()-1);
			isVisited[i] = false;
		}
	}
}
