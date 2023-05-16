package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class _2161 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        Deque<Integer> d = new LinkedList<>();
        for(int i=1; i<=n; i++) {
            d.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while (!d.isEmpty()) {

            sb.append(d.pollFirst()).append(" ");
            if (d.isEmpty()) {
                break;
            }
            d.add(d.pollFirst());
        }

        System.out.println(sb);
    }
}
