package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2565 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] input = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            String[] tmp = br.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);

            input[i] = a;
            map.put(a, b);
        }
        br.close();
        Arrays.sort(input);

        int[] dp = new int[n];
        int max = 0;

        for(int i=0; i<n; i++) {
            dp[i] = 1;

            for(int j=0; j<i; j++) {
                if(map.get(input[i]) > map.get(input[j]) && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
            }

            max = max < dp[i] ? dp[i] : max;
        }


        System.out.println(n - max);
    }
}
