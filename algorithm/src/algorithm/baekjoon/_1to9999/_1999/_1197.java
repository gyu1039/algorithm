package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _1197 {

    static int[] parent;
    static List<String> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        parent = new int[V+1];
        graph = new ArrayList<>(E);

        for(int i=1; i<=V; i++) {
            parent[i] = i;
        }

        for(int i=0; i<E; i++) {
            graph.add(br.readLine());
        }

        Collections.sort(graph, (s1, s2) -> {
            return Integer.parseInt(s1.split(" ")[2]) > Integer.parseInt(s2.split(" ")[2]) ? 1 : -1;
        });

        int count = 0;
        int i = 0;
        int result = 0;
        while(count != V-1) {
            String s = graph.get(i);

            st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int pa = findSet(a);
            int pb = findSet(b);
            if(pa != pb) {
                result += Integer.parseInt(st.nextToken());
                union(pa, pb);
                count++;

            }
            i += 1;
        }

        System.out.println(result);
    }

    private static void union(int pa, int pb) {

    }

    public static int findSet(int x) {

        while (x != parent[x]) {
            x = parent[x];
        }

        return x;
    }
}
