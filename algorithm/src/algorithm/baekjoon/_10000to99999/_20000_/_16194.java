package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16194 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        br.close();

        int[] arr = new int[n+1];
        for(int i=0; i<n; i++) {
            arr[i+1] = Integer.parseInt(strs[i]);
        }

        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++) {
            int min = 10_001;
            for(int j=1; j<=i; j++) {
                min = Math.min(min, arr[j] + dp[i-j]);
            }
            dp[i] = min;
        }

        System.out.println(dp[n]);
    }
}
