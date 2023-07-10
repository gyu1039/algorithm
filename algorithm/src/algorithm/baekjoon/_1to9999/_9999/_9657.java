package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9657 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        boolean[] dp = new boolean[n+4];

        dp[1] = dp[3] = dp[4] = true;
        dp[2] = false;

        for(int i=5; i<=n; i++) {

            if(!dp[i-1] || !dp[i-3] || !dp[i-4] ) {
                dp[i] = true;
            }
        }

        System.out.println(dp[n] ? "SK" : "CY");
    }
}
