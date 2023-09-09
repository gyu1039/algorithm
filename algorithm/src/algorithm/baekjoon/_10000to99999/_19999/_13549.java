package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _13549 {

    static class Loc {

        int idx, time;

        public Loc(int idx, int time) {
            this.idx = idx;
            this.time = time;
        }
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        br.close();

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        Queue<Loc> q = new LinkedList<>();
        final int max = 100_000;
        boolean[] isVisited = new boolean[max + 1];
        q.add(new Loc(N, 0));

        int answer = Integer.MAX_VALUE;

        while (!q.isEmpty()) {

            Loc now = q.poll();

            isVisited[now.idx] = true;

            if(now.idx == K) {
                answer = Math.min(answer, now.time);
            }

            if(now.idx * 2 <= max && !isVisited[now.idx * 2]) {
                q.add(new Loc(now.idx * 2, now.time));
            }

            if(now.idx + 1 <= max && !isVisited[now.idx + 1]) {
                q.add(new Loc(now.idx + 1, now.time + 1));
            }

            if(0 <= now.idx - 1 && !isVisited[now.idx - 1]) {
                q.add(new Loc(now.idx - 1, now.time+ 1));
            }


        }

        System.out.println(answer);

    }
}
