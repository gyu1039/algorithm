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

        Map<Integer, Integer> ladders = new HashMap<>();
        for(int i=0; i<n; i++) {
            input = br.readLine().split(" ");
            ladders.put(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }

        Map<Integer, Integer> snakes = new HashMap<>();
        for(int i=0; i<m; i++) {
            input = br.readLine().split(" ");
            snakes.put(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }
        br.close();

        int answer = 0;
        int start = 1;
        while(start < 100) {

        }



        System.out.println(answer);
    }
}
