package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _16928 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        boolean[] isVisited = new boolean[101];

        Map<Integer, Integer> jumps = new HashMap<>();
        for(int i=0; i<n; i++) {
            input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);

            jumps.put(u, v);
        }

        for(int i=0; i<m; i++) {
            input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);

            jumps.put(u, v);
        }
        br.close();

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {1, 0});
        isVisited[1] = true;

        while(!q.isEmpty()) {
            int[] ar = q.poll();
            int loc = ar[0];
            int count = ar[1];

            if(loc == 100) {
                System.out.println(count);
                break;
            }

            for(int i=1; i<=6; i++) {
                if(loc + i < isVisited.length && !isVisited[loc + i]) {

                    isVisited[loc + i] = true;
                    if (jumps.containsKey(loc + i)) {
                        q.add(new int[]{jumps.get(loc + i), count + 1});
                        isVisited[jumps.get(loc + i)] = true;

                    } else {
                        q.add(new int[]{loc + i, count + 1});

                    }
                }
            }
        }
    }
}
