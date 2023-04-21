package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _1197 {

    static Parentsize[] parentSize;
    static List<UV> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        parentSize = new Parentsize[V+1];
        graph = new ArrayList<>(E);

        for(int i=1; i<=V; i++) {
            parentSize[i] = new Parentsize(i, 1);
        }

        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            graph.add(new UV(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(graph, (e1, e2) -> {
            return e1.w > e2.w ? 1 : -1;
        });

        int count = 0;
        int i = 0;
        int result = 0;
        while(count != V-1) {
            UV uv = graph.get(i);

            int a = uv.a;
            int b = uv.b;

            int pa = findSet(a);
            int pb = findSet(b);
            if(pa != pb) {
                result += uv.w;
                union(pa, pb);
                count++;
            }
            i += 1;
        }

        System.out.println(result);
    }

    private static void union(int pa, int pb) {

        if (parentSize[pa].size > parentSize[pb].size) {
            parentSize[pb].parent = parentSize[pa].parent;
            parentSize[pa].size += parentSize[pb].size;

        } else {

            parentSize[pa].parent = parentSize[pb].parent;
            parentSize[pb].size += parentSize[pb].size;
        }
    }

    private static int findSet(int x) {

        while (x != parentSize[x].parent) {
            x = parentSize[x].parent;
        }

        return x;
    }

    static class UV {
        int a, b, w;

        public UV(int a, int b, int w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }
    }

    static class Parentsize {
        int parent;
        int size;

        public Parentsize(int parent, int size) {
            this.parent = parent;
            this.size = size;
        }
    }

}
