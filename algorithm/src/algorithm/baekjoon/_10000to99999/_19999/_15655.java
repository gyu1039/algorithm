package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class _15655 {

    static int M, N;
    static StringBuilder sb;
    static int[] ints;
    static boolean[] isVisited;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        ints = new int[N];
        isVisited = new boolean[N];
        list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ints);

        sb = new StringBuilder();
        backtracking(0,0);

        System.out.println(sb);
    }

    private static void backtracking(int start, int count) {

        if(count == M) {
            for(int n : list) {
                sb.append(n).append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int i = start; i < N; i++) {
            if(!isVisited[i]) {
                list.add(ints[i]);
                isVisited[i] = true;
                backtracking(i,count + 1);
                isVisited[i] = false;
                list.remove(list.size() - 1);
            }
        }

    }


}
