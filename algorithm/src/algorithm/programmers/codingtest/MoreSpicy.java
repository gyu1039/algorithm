package algorithm.programmers.codingtest;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n : scoville) {
            pq.add(n);
        }

        int min1 = pq.poll();
        int min2 = 0;
        while(min1 < K) {
            min2 = pq.poll();
            pq.add(min1 + min2 * 2);
            answer++;

            if(pq.size() < 2 && pq.peek() < K) {
                return -1;
            }

            min1 = pq.poll();
        }

        return answer ;
    }
}
