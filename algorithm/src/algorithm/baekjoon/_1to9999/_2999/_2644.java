package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2644 {

    static List<Integer>[] list;
    static int result = -1;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());

        list = new ArrayList[N+1];
        isVisited = new boolean[N+1];
        for(int i=1; i<=N; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }

        bfs(a, b, 1);
        System.out.println(result);
    }

    private static void bfs(int a, int b, int count) {

        isVisited[a] = true;
        for(Integer l : list[a]) {

            if(l == b) {
                result = count;
                return;
            }
            if(!isVisited[l]) {
                bfs(l, b, count+1);
            }
        }

    }

}
