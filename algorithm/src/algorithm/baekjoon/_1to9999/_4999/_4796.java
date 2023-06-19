package algorithm.baekjoon._1to9999._4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4796 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l, p, v;
        String[] st = br.readLine().split(" ");
        StringBuilder answer = new StringBuilder();
        int i = 1;
        while ((l = Integer.parseInt(st[0])) != 0 &&
                (p = Integer.parseInt(st[1])) != 0 &&
                (v = Integer.parseInt(st[2])) != 0) {

            int days = 0;
            answer.append("Case ").append(i).append(": ");
            while(p <= v) {
                v -= p;
                days += l;
            }
            days += Math.min(v, l);
            i += 1;
            answer.append(days).append("\n");

            st = br.readLine().split(" ");
        }
        br.close();

        System.out.println(answer);
    }
}
