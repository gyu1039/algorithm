package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1697 {

	static int K;
	static boolean[] visited = new boolean[100001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		if(N == K) {
			System.out.println(0);
			return;
		}

		System.out.println(bfs(N));

	}

	static int bfs(int num) {

		Queue<Integer> q = new LinkedList<>();

		int seconds = 0;
		q.add(num);

		while(true) {

			int size = q.size();

			for(int j=0; j<size; j++) {
				int n = q.poll();
				visited[n] = true;

				if(n-1 == K || n+1 == K || n*2 == K) {
					return seconds+1;
				}

				if(n-1 >= 0 && !visited[n-1]) {
					q.add(n-1);
				} 

				if(n+1 <= 100_000 && !visited[n+1]) {
					q.add(n+1);
				}

				if(n*2 <= 100_000 && !visited[n*2]) {
					q.add(n*2);
				}
			}
			seconds++;
		}
	}

}
