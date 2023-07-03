package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2477 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int a = 1;
        for(int i=0; i<6; i++) {
            String[] input = br.readLine().split(" ");
            int d = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);

            list.add(l);
            if(map.containsKey(d)) {

            }
            map.put(d, map.getOrDefault(d, 0) + l);
        }

        System.out.println((map.get(1) * map.get(4) - a) * k);
    }
}
