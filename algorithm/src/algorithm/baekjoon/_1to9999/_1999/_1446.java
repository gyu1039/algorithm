package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1446 {

    static class NextNode {

        int idx, weight;

        public NextNode(int idx, int weight) {
            this.idx = idx;
            this.weight = weight;
        }
    }

    public void way1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        List<NextNode>[] graph = new ArrayList[D+1];
        PriorityQueue<NextNode> p = new PriorityQueue<>((n1, n2) -> {
            return Integer.compare(n1.weight, n2.weight);
        });

        for(int i=0; i<=D; i++) {
            graph[i] = new ArrayList<>();
            graph[i].add(new NextNode(i + 1, 1));
        }

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if(a > D) {
                continue;
            }
            graph[a].add(new NextNode(b, w));
        }

        int[] dist = new int[D+1];
        for(int i=1; i<=D; i++) {
            dist[i] = 10_001;
        }
        p.add(new NextNode(0, 0));

        while (!p.isEmpty()) {

            NextNode curNode = p.poll();

            if (dist[curNode.idx] < curNode.weight) {
                continue;
            }

            for(int i=0; i<graph[curNode.idx].size(); i++) {

                NextNode nextNode = graph[curNode.idx].get(i);

                if(nextNode.idx > D) {
                    continue;
                }

                if (dist[nextNode.idx] > curNode.weight + nextNode.weight) {
                    dist[nextNode.idx] = curNode.weight + nextNode.weight;
                    p.add(new NextNode(nextNode.idx, dist[nextNode.idx]));
                }
            }
        }

        System.out.println(dist[D]);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] dist = new int[D + 1];
        int[][] ns = new int[N][3];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            ns[i] = new int[]{a, b, c};
        }

        for(int i=1; i<=D; i++) {
            int d = dist[i-1] + 1;

            for(int j=0; j<N; j++) {
                if(ns[j][1] == i) {
                    d = Math.min(d, ns[j][2] + dist[ns[j][0]]);

                }
            }

            dist[i] = d;
        }

        System.out.println(dist[D]);
    }
}
