package algorithm.baekjoon._1to9999._4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _4358 {

    public static void main(String[] args) throws IOException {

        String input;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;
        Map<String, Integer> table = new HashMap<>();
        while ((input = br.readLine()) != null && input.length() > 0) {
            table.put(input, table.getOrDefault(input, 0) + 1);
            total += 1;
        }
        br.close();

        List<String> list = new ArrayList<>(table.keySet());
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(String name : list) {

            int cnt = table.get(name);
            double result = (double)Math.round(((double) cnt / total * 100) * 10_000) / 10_000;

            sb.append(name).append(" ").append(String.format("%.4f", result)).append("\n");
        }

        System.out.println(sb);

    }
}
