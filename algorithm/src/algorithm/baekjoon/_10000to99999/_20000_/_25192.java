package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _25192 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        int result = 0;
        while(N-- > 0) {
            String s = br.readLine();
            if(s.equals("ENTER")) {
                set = new HashSet<>();
                continue;
            } else if(!set.contains(s)) {
                set.add(s);
                result += 1;
            }
        }

        System.out.println(result);
    }
}
