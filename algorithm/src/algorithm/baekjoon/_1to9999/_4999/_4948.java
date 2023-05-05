package algorithm.baekjoon._1to9999._4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(n != 0) {

            int count = 0;
            outer: for(int i=n+1; i<=2*n; i++) {
                int sqrt = (int)Math.sqrt(i);
                for(int j=2; j<=sqrt; j++) {
                    if(i % j == 0) {
                        continue outer;
                    }
                }
                count += 1;
            }
            sb.append(count).append("\n");
            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);

    }
}
