package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _18352 {

    static class NextNode {
        int idx, weight;

        NextNode(int idx, int weight) {
            this.idx = idx;
            this.weight = weight;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        PriorityQueue<NextNode> q
                = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.weight, o2.weight));
        List<NextNode>[] graph = new ArrayList[N + 1];
        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(new NextNode(b, 1));
        }

        int[] dist = new int[N + 1];
        for(int i=1; i<=N; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        q.offer(new NextNode(X, 0));
        dist[X] = 0;

        while (!q.isEmpty()) {
            NextNode curNode = q.poll();

            if (dist[curNode.idx] < curNode.weight) {
                continue;
            }

            for(int i=0; i<graph[curNode.idx].size(); i++) {

                NextNode nextNode = graph[curNode.idx].get(i);

                if (dist[nextNode.idx] > curNode.weight + nextNode.weight) {
                    dist[nextNode.idx] = curNode.weight + nextNode.weight;
                    q.offer(new NextNode(nextNode.idx, dist[nextNode.idx]));
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            if(dist[i] == K) {
                result.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        if(result.size() == 0) {
            sb.append("-1");
        } else {
            for(int n : result) {
                sb.append(n).append("\n");
            }
        }

        System.out.println(sb);
    }
}
