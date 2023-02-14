package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25501 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        outer: for(int i=0; i<testCases; i++) {
            String s = br.readLine();
            int len = s.length()/2;
            int count = 1;

            for(int j=0; j<len; j++) {
                count++;
               if(s.charAt(j) != s.charAt(s.length() - (j + 1))) {
                   sb.append("0 ").append(--count).append("\n");
                   continue outer;
               }
            }
            sb.append("1 ").append(count).append("\n");
        }

        System.out.println(sb);
    }
}
