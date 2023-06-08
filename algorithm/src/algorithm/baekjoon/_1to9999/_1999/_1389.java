package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1389 {

    static List<Integer>[] list;
    static boolean[] isVisited;

    static class Node {

        int n, w;

        Node(int n, int w) {
            this.n = n;
            this.w = w;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        list = new ArrayList[n+1];
        isVisited = new boolean[n+1];
        for(int i=1; i<=n; i++) {
            list[i] = new ArrayList<>();
        }

        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        int answer = 0;
        int total = Integer.MAX_VALUE;
        Queue<Node> q = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            q.add(new Node(i, 0));
            isVisited[i] = true;
            int count = 0;
            while (!q.isEmpty()) {
                Node cur = q.poll();
                for (int next : list[cur.n]) {
                    if(!isVisited[next]) {
                        isVisited[next] = true;
                        q.add(new Node(next, cur.w + 1));
                        count += cur.w + 1;
                    }
                }
            }
            if(total > count) {
                answer = i;
                total = count;
            }
            isVisited = new boolean[n+1];
        }

        System.out.println(answer);
    }



}
