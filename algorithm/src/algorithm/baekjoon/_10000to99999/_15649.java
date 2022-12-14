package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _15649 {
	
	static boolean[] isVisited;
	static List<Integer> list;
	static StringBuilder sb;
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		N = Integer.parseInt(tmp[0]);
		M = Integer.parseInt(tmp[1]);
		
		sb = new StringBuilder();
		isVisited = new boolean[N+1];
		list = new ArrayList<>();
		
		backtracking(0);
		
		System.out.println(sb);
	}

	private static void backtracking(int count) {
		
		if(count == M) {
			for(int n : list) {
				sb.append(n).append(" ");
			}
			sb.append("\n");
			
			return;
		}
		
		for(int i=1; i<=N; i++) {
			if(isVisited[i]) {
				continue;
			}
			isVisited[i] = true;
			list.add(i);
			backtracking(count+1);
			list.remove(list.size()-1);
			isVisited[i] = false;
		}
		
	}
	
	
}
