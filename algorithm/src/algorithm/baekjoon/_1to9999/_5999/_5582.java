package algorithm.baekjoon._1to9999._5999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5582 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        br.close();

        int[][] dp = new int[arr1.length + 1][arr2.length + 1];
        int answer = 0;

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {

                if(arr1[i] == arr2[j]) {
                    dp[i+1][j+1] = dp[i][j] + 1;
                    answer = Math.max(dp[i+1][j+1], answer);
                }
            }
        }

        for(int[] ar : dp) {

            for(int n : ar) {
                System.out.print(n + ", ");
            }
            System.out.println();
        }
        System.out.println(answer);
    }
}
