package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14916 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int[] dp = new int[n+5];

        dp[1] = -1;
        dp[2] = 1;
        dp[3] = -1;
        dp[4] = 2;
        dp[5] = 1;
        for(int i=6; i<=n; i++) {

            if(dp[i-2] != -1) {
                dp[i] = dp[i-2] + 1;
            }

            if(dp[i-5] != -1) {
                dp[i] = dp[i-5] + 1;
            }
        }

        System.out.println(dp[n]);
    }
}
