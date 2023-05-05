package algorithm.baekjoon._1to9999._4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _4134 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        long[] ar = new long[T];
        for(int i=0; i<T; i++) {
            ar[i] = Long.parseLong(br.readLine());
        }
        StringBuilder sb = new StringBuilder();

        for(long n : ar) {

            if(n == 0 || n == 1 || n == 2) {
                sb.append("2\n");
                continue;
            }

            outer: for(long i=n; true; i++) {
                int sqrt = (int)Math.sqrt(i);

                for(int j=2; j<=sqrt; j++) {
                    if(i % j == 0) {
                        continue outer;
                    }
                }

                sb.append(i).append("\n");
                break;
            }
        }

        System.out.println(sb);
    }
}
