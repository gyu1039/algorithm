package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _13023 {
	
	static boolean status;
	static List<Integer>[] list;
	static boolean[] check;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		list = new ArrayList[N];
		for(int i=0; i<N; i++) {
			list[i] = new ArrayList<>();
		}

		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			list[n1].add(n2);
			list[n2].add(n1);
		}

		for(int i=0; i<N; i++) {
			check = new boolean[N];
			dfs(i, 1);

			if(status) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}

	public static void dfs(int idx, int depth) {
		
		if(depth == 5) {
			status = true;
			return;
		}
		
		check[idx] = true;
		for(int i : list[idx]) {
			
			if(!check[i]) {
				dfs(i, depth+1);
			}
		}
		check[idx] = false;
	}
}
