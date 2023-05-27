package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _10974 {

    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        br.close();

        int[] ar = new int[N+1];
        for(int i=1; i<=N; i++) {
            ar[i] = i;
        }
        boolean[] isUsed = new boolean[N+1];

        backtracking(ar, isUsed, new ArrayList<>());

        System.out.println(sb);

    }

    static void backtracking(int[] ar, boolean[] isUsed, List<Integer> list) {

        if(list.size() == N) {

            for(int n : list) {
                sb.append(n).append(" ");
            }

            sb.append("\n");
            return;
        }

        for(int i=1; i<=N; i++) {

            if(!isUsed[i]) {
                isUsed[i] = true;
                list.add(ar[i]);
                backtracking(ar, isUsed, list);
                isUsed[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
