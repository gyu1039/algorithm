package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9466 {

	static int[] students;
	static int[] nthVisited;
	static int[] startNode;
	static int numberOfMember;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
	
		StringBuilder sb = new StringBuilder();
		while(testCase-- > 0) {
			
			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			students = new int[n+1];
			nthVisited = new int[n+1];
			startNode = new int[n+1];
			numberOfMember = 0;
			
			for(int i=1; i<=n; i++) {
				students[i] = Integer.parseInt(st.nextToken());
			}

			for(int i=1; i<=n; i++) {
				if(nthVisited[i] == 0) {
					dfs(i, 1, i);
				}
			}
			sb.append(n - numberOfMember).append("\n");
			
		}
		
		System.out.println(sb);
	}

	private static void dfs(int i, int count, int start) {

		nthVisited[i] = count;
		startNode[i] = start;
		
		int next = students[i];
		
		if(nthVisited[next] != 0) {
			if(start == startNode[next]) {
				numberOfMember += (count - nthVisited[next] + 1);
			}
			
			return;
		}

		
		dfs(students[i], count+1, start);
	}
	
	
}
