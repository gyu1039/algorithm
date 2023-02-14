package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _15652 {

    static int N;
    static int M;
    static List<Integer> list;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        list = new ArrayList<>();
        sb = new StringBuilder();

        for(int i=1; i<=N; i++) {
            bfs(i);
        }

        System.out.println(sb);
    }

    private static void bfs(int n) {

        list.add(n);
        if(list.size() == M) {
            for(int tmp : list) {
                sb.append(tmp).append(" ");
            }
            sb.append("\n");
            list.remove(list.size() - 1);
            return;
        }


        for(int i=n; i<=N; i++) {
            bfs(i);
        }
        list.remove(list.size()-1);
    }
}
