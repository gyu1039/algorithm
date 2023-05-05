package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _26069 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            if (s1.equals("ChongChong") || s2.equals("ChongChong")) {
                set.add(s1);
                set.add(s2);
            } else if(set.contains(s1)) {
                set.add(s2);
            } else if (set.contains(s2)) {
                set.add(s1);
            }

        }

        System.out.println(set.size());
    }
}
