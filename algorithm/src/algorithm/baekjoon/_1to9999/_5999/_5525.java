package algorithm.baekjoon._1to9999._5999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String target = br.readLine();
        br.close();

        String pattern = "I" + "OI".repeat(n);
        int[] pi = new int[pattern.length()];
        int begin = 0;
        for(int right=1; right<pi.length; right++) {

            while (begin > 0 && pattern.charAt(begin) != pattern.charAt(right)) {
                begin = pi[begin-1];
            }

            if(pattern.charAt(begin) == pattern.charAt(right)) {
                begin += 1;
                pi[right] = begin;
            }
        }

        int count = 0;
        begin = 0;
        for(int right=0; right<m; right++) {


        }

        System.out.println(count);

    }
}
