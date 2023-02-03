package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class _15654 {

    static int N;
    static int M;
    static int[] arr;
    static List<Integer> list;
    static boolean[] isVisited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        list = new ArrayList<>();
        isVisited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        sb = new StringBuilder();
        backtracking(0);

        System.out.println(sb);
    }

    private static void backtracking(int count) {

        if(count == M) {
            for(int n : list) {
                sb.append(n).append(" ");
            }
            sb.append("\n");

            return;
        }

        for(int i=0; i<N; i++) {

            if (!isVisited[i]) {
                isVisited[i] = true;
                list.add(arr[i]);
                backtracking(count + 1);
                isVisited[i] = false;
                list.remove(list.size() - 1);
            }

        }
    }
}
