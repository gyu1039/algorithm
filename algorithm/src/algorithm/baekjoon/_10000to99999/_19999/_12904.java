package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12904 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder t = new StringBuilder(br.readLine());
        br.close();

        while(s.length() < t.length()) {
            int lastIdx = t.length() - 1;
            if(t.charAt(lastIdx) == 'B') {
                t.setLength(lastIdx);
                t.reverse();

            } else {

                t.setLength(lastIdx);
            }
        }

        System.out.println(s.equals(t.toString()) ? 1 : 0);


    }
}
