package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9655 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        System.out.println(N % 2 == 1 ? "SK" : "CY");
        way2(N);
    }


    static void way2(int n) {

        int[] dp = new int[n+2];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++) {

            dp[i] = Math.min(dp[i-3], dp[i-1]) + 1;
        }

        System.out.println(dp[n] % 2 == 0 ? "CY" : "SK");

    }
}
