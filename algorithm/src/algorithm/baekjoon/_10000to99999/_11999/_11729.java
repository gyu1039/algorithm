package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _11729 {

    static int N;
    static long count;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        br.close();

        sb = new StringBuilder();

        rec(N, 1, 3);
        System.out.println(count);
        System.out.println(sb);
    }


    public static void rec(int n, int src, int dst) {


        int tmp = 6 - src - dst;
        if(n == 0) {
            return;
        }


        rec(n - 1, src, tmp);

        count +=1 ;
        sb.append(src).append(" ").append(dst).append("\n");

        rec(n - 1, tmp, dst);

    }
}
