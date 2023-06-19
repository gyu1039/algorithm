package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _1302 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> table = new HashMap<>();
        int maxCount = 0;
        String answer = "";
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            table.put(s, table.getOrDefault(s, 0) + 1);

            if(maxCount < table.get(s)) {
                answer = s;
                maxCount = table.get(s);
            } else if(maxCount == table.get(s)) {
                answer = answer.compareTo(s) <= 0 ? answer : s;
            }
        }
        br.close();

        System.out.println(answer);
    }
}
