package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1715 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        int answer = 0;
        while(pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            answer += a + b;
            pq.add(a+b);
        }

        System.out.println(answer);
    }
}
