package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _2565 {

    static class Line {

        int a, b;

        public Line(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Line[] arr = new Line[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new Line(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a.a));

        int[] dp = new int[n];
        dp[0] = 0;
        for(int cur=1; cur<dp.length; cur++) {

            if(arr[cur].b < arr[cur-1].b) {
                dp[cur] = 1;
                int count = 0;
                for(int prev=0; prev<cur; prev++){
                    if(arr[cur].b < arr[prev].b) {
                        count += 1;
                        continue;
                    }
                    break;
                }

                dp[cur] = Math.max(dp[cur], count);
            } else {
                dp[cur] = dp[cur-1];
            }
        }

        System.out.println(dp[n-1]);
    }
}
