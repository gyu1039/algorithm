package algorithm.baekjoon._1to9999._4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4779 {

    static char[] cantorSet;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();
        while(s != null && !s.equals("")) {
            int n = Integer.parseInt(s);
            n = (int)Math.pow(3, n);
            cantorSet = new char[n];
            for(int i=0; i<n; i++) {
                cantorSet[i] = '-';
            }

            rec(0, n);
            for(int i=0; i<n; i++) {
                sb.append(cantorSet[i]);
            }
            sb.append("\n");
            s = br.readLine();
        }

        System.out.println(sb);
    }

    public static void rec(int start, int len) {

        if(len <= 1) {
            return;
        }

        for(int i=start+len/3; i<start + len/3 * 2; i++) {
            cantorSet[i] = ' ';
        }

        rec(start, len/3);
        rec(start + len / 3 * 2, len/3);

    }
}
