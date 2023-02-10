package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = N;
        for(int i=0; i<N; i++) {
            String s = br.readLine();
            char prev = s.charAt(0);
            Set<Character> set = new HashSet<>();
            set.add(prev);

            for (int j = 1; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c == prev) {
                    continue;
                }

                if(set.contains(c)) {
                   count--;
                   break;
                }
                set.add(c);
                prev = c;
            }
        }

        System.out.println(count);
    }
}
