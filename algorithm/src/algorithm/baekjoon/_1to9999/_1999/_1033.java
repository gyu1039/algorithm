package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _1033 {
	
	static ArrayList<cNode>[] list;
	static long leastCommonMultiple;
	static boolean[] visited;
	static long[] d;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		list = new ArrayList[N];
		visited = new boolean[N];
		d = new long[N];
		leastCommonMultiple = 1;
		
		for(int i=0; i<N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<N-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
		
			list[a].add(new cNode(b, p, q));
			list[b].add(new cNode(a, q, p));
			leastCommonMultiple *= (p * q / gcd(p, q));
		}
		
		d[0] = leastCommonMultiple;
		DFS(0);
		long mgcd = d[0];
		
		for(int i=1; i<N; i++) {
			mgcd = gcd(mgcd, d[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N;i ++) {
			sb.append(d[i] / mgcd).append(" ");
		}
		
		System.out.println(sb);
		
	}
	
	public static void DFS(int Node) {
		
		visited[Node] = true;
		
		for(cNode i : list[Node]) {
			
			int next = i.getB();
			
			if(!visited[next]) {
				d[next] = d[Node] * i.getQ() / i.getP();
				DFS(next);
			}
		}
	}
	
	private static long gcd(long a, long b) {

		long tmp = b;
		
		while(tmp != 0) {
			
			tmp = a % b;
			a = b;
			if(tmp == 0) {
				return a;
			}
			b = tmp;
		}
	
		return 1;
	}

	static class cNode {
		int b, p, q;

		public cNode(int b, int p, int q) {
			this.b = b;
			this.p = p;
			this.q = q;
		}

		public int getB() {
			return b;
		}

		public int getP() {
			return p;
		}

		public int getQ() {
			return q;
		}
	}
}
