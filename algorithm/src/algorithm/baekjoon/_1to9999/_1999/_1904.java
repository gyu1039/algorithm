package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1904 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int[] dp = new int[N + 2];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=N; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 15746;
        }

        System.out.println(dp[N]);

    }
}
