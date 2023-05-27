package algorithm.baekjoon._1to9999._4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _4158 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while(!(N == 0 && M == 0)) {
            solve(N, M, br, sb);

            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }

        br.close();

        System.out.println(sb);

    }

    static void solve(int N, int M, BufferedReader br, StringBuilder sb) throws IOException {

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(br.readLine());
            set.add(a);
        }

        int result = 0;
        for(int i=0; i<M; i++) {
            int a = Integer.parseInt(br.readLine());
            if(set.contains(a)) {
                result += 1;
            }
        }

        sb.append(result).append("\n");
    }
}
