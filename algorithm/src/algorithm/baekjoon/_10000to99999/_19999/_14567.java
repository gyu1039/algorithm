package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _14567 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer>[] list = new ArrayList[N + 1];
        int[] inDegree = new int[N + 1];
        boolean[] isVisited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            inDegree[b]++;
            list[a].add(b);
        }

        Deque<Integer> d = new LinkedList<>();
        int[] result = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0 && !isVisited[i]) {
                d.add(i);
                isVisited[i] = true;
                result[i] = 1;
            }
        }


        while (!d.isEmpty()) {

            int n = d.poll();
            for (int a : list[n]) {
                inDegree[a]--;

                if (inDegree[a] == 0) {
                    d.add(a);
                    isVisited[a] = true;
                    result[a] = Math.max(result[n], result[a]) + 1;
                } else {
                    result[a] = result[n];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb);
    }
}
