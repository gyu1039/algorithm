package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _9372 {

    static boolean[] isVisited;
    static List<Integer>[] graph;
    static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int theNumberOfNation = Integer.parseInt(st.nextToken());
            int typeOfAirplane = Integer.parseInt(st.nextToken());

            for(int i=0; i<typeOfAirplane; i++) {
                br.readLine();
            }

            /*isVisited = new boolean[theNumberOfNation + 1];
            graph = new ArrayList[theNumberOfNation + 1];

            for(int i=1; i<graph.length; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < typeOfAirplane; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph[a].add(b);
                graph[b].add(a);
            }

            dfs(1);*/
            sb.append(theNumberOfNation - 1).append("\n");
        }

        System.out.println(sb);
    }

    /*private static void dfs(int n) {

        if(isVisited[n]) {
            return;
        }

        isVisited[n] = true;
        for(int l : graph[n]) {
            if(!isVisited[l]) {
                result++;
                dfs(l);
            }
        }
    }*/
}
