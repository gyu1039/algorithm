package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class _20920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> table = new HashMap<>();
        while (N-- > 0) {

            String s = br.readLine();
            if(s.length() < M) {
                continue;
            }

            table.put(s, table.getOrDefault(s, 0) + 1);
        }

        List<String> strs = table.keySet().stream().collect(Collectors.toList());
        Collections.sort(strs, (s1, s2) -> {
            int a1 = table.get(s1);
            int a2 = table.get(s2);

            if(a1 == a2 ) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return s2.length() - s1.length();
            }
            return a2 - a1;
        });

        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);



    }


}




