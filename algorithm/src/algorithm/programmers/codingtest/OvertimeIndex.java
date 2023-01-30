package algorithm.programmers.codingtest;

import java.util.PriorityQueue;

public class OvertimeIndex {

    public long solution(int n, int[] works) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(works.length, (a, b) -> {
            return a < b ? 1 : -1;
        });

        for(int k : works) {
            pq.add(k);
        }

        while(n-- > 0) {
            pq.add(pq.poll() - 1);
        }

        long answer = 0;
        while(pq.size() > 0) {
            int k = pq.poll();
            if(k > 0) {
                answer += (long)k * k;
            }
        }

        return answer;
    }
}
