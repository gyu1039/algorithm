package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11403 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] graph = new int[n][n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();


        for(int i=0; i<n; i++) {

            boolean[] isVisited = new boolean[n];
            dfs(i, graph, isVisited);

            for(int k=0; k<n; k++) {
                if(isVisited[k]) {
                    graph[i][k] = 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sb.append(graph[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static void dfs(int to, int[][] graph, boolean[] isVisited) {

        for(int i=0; i<graph.length; i++) {

            if(graph[to][i] == 1 && !isVisited[i]) {
                isVisited[i] = true;
                dfs(i, graph, isVisited);
            }
        }

    }
}
