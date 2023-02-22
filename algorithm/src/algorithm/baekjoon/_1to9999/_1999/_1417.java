package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class _1417 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int dasom = Integer.parseInt(br.readLine());

        for(int i=0; i<N-1; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        int result = 0;
        while(!pq.isEmpty() && dasom <= pq.peek()) {
            result++;
            dasom++;
            pq.add(pq.poll() - 1);
        }

        System.out.println(result);
    }
}
