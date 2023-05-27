package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1182 {

    static int N, S, answer;
    static int[] ar;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        ar = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }

        backtracking(-1, 0, false);


        System.out.println(answer);
    }

    static void backtracking(int idx, int sum, boolean p) {

        if(sum == S && p) {
            answer += 1;
        }

        if(idx == N-1) {
            return;
        }


        backtracking(idx+1, sum + ar[idx+1], true);
        backtracking(idx+1, sum, false);

    }
}
