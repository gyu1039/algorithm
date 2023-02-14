package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class _15656 {

    static int N, M;
    static List<Integer> list;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        arr = new int[N];
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(arr);

        backtracking(0);

        System.out.println(sb);

    }

    private static void backtracking(int count) {

        if(count == M) {
            for (int n : list) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {

            list.add(arr[i]);
            backtracking(count + 1);
            list.remove(list.size() - 1);
        }

    }
}
