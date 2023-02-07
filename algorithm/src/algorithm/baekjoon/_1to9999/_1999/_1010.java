package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1010 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        long[][] dp = new long[30][30];

        for(int i=0; i<dp.length; i++) {
            dp[i] = new long[i+1];
        }

        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;

        for(int i=2; i<dp.length; i++) {
            dp[i][0] = 1;
            for(int j=1; j < dp[i].length - 1; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
            dp[i][i] = 1;
        }

        StringBuilder sb = new StringBuilder();
        while (testCases-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            sb.append(dp[n][r]).append("\n");
        }

        System.out.println(sb);
    }
}
