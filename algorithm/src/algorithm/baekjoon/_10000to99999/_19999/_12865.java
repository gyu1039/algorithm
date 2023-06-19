package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _12865 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int k = Integer.parseInt(tmp[1]);

        List<int[]> input = new ArrayList<>();
        for(int i=0; i<n; i++) {
            tmp = br.readLine().split(" ");
            int w = Integer.parseInt(tmp[0]);
            int v = Integer.parseInt(tmp[1]);

            if(w <= k) {
                input.add(new int[]{w, v});
            }

        }
        br.close();

        n = input.size();
        int[][] dp = new int[n+1][k+1];
        for(int i=1; i<=n; i++) {

            int[] nth = input.get(i-1);
            int curW = nth[0];
            int curV = nth[1];

            for(int w=1; w<=k; w++) {

                if(curW > w) {
                    dp[i][w] = dp[i-1][w];
                } else {
                    dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w-curW] + curV);
                }
            }
        }

        System.out.println(dp[n][k]);
    }
}
