package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class _24447 {

	static int[] depthOfNth; 
	static int[] visitOrderOfNth;
	static List<Integer>[] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		depthOfNth = new int[N+1];
		visitOrderOfNth = new int[N+1];
		graph = new ArrayList[N+1];
		
		Arrays.fill(depthOfNth, -1);
		for(int i=1; i<=N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}

		for(int i=1; i<=N; i++) {
			Collections.sort(graph[i]);
		}
		
		bfs(R);
		
		long result = 0;
		for(int i=1; i<=N; i++) {
			result += ((long)depthOfNth[i] * visitOrderOfNth[i]);
		}
		
		System.out.println(result);
	}

	private static void bfs(int r) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		int order = 1;
		
		depthOfNth[r] = 0;
		visitOrderOfNth[r] = order++;
		q.add(r);
		
		while(q.size() > 0) {
			
			int n = q.poll();
			for(int e : graph[n]) {
				
				if(visitOrderOfNth[e] == 0) {
					depthOfNth[e] = depthOfNth[n] + 1;
					visitOrderOfNth[e] = order++;
					q.add(e);
				}
			}
		}
	}
}
