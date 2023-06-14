package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1932 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n+1][];
        dp[0] = new int[2];
        int max = 0;
        for(int i=1; i<=n; i++) {
            dp[i] = new int[i+2];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=i; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
                if(max < dp[i][j]) {
                    max = dp[i][j];
                }
            }
        }

        br.close();
        System.out.println(max);
    }
}
