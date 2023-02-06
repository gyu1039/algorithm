package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class _15657 {

    static int[] ints;
    static int N, M;
    static List<Integer> list;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        sb = new StringBuilder();
        ints = new int[N];
        st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < N; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ints);

        backtracking(0,0);

        System.out.println(sb);

    }


    private static void backtracking(int p ,int count) {

        if (count == M) {

            for (int n : list) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = p; i < N; i++) {

            list.add(ints[i]);
            backtracking(i, count + 1);
            list.remove(list.size() - 1);
        }
    }
}
