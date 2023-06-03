package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _9375 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            while(n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String sort = st.nextToken();

                map.put(sort, map.getOrDefault(sort, 0) + 1);
            }

            int t = 1;
            for(int c : map.values()) {
                t *= (c + 1);
            }
            sb.append(t - 1).append("\n");
        }

        System.out.println(sb);
    }
}
