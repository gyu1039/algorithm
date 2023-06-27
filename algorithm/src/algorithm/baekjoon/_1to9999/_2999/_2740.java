package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2740 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int an = Integer.parseInt(input[0]);
        int am = Integer.parseInt(input[1]);
        int[][] a = new int[an][am];
        for(int i=0; i<a.length; i++) {
            input = br.readLine().split(" ");
            for(int j=0; j<a[i].length; j++) {
                a[i][j] = Integer.parseInt(input[j]);
            }
        }

        input = br.readLine().split(" ");
        int bn = Integer.parseInt(input[0]);
        int bm = Integer.parseInt(input[1]);
        int[][] b = new int[bn][bm];
        for(int i=0; i<b.length; i++) {
            input = br.readLine().split(" ");
            for(int j=0; j<b[i].length; j++) {
                b[i][j] = Integer.parseInt(input[j]);
            }
        }
        br.close();

        StringBuilder answer = new StringBuilder();

        for(int i=0; i<an; i++) {

            for(int k=0; k<bm; k++) {
                int sum = 0;
                for(int j=0; j<bn; j++) {
                    sum += a[i][j] * b[j][k];
                }
                answer.append(sum).append(" ");
            }
            answer.append("\n");
        }
        System.out.println(answer);

    }
}
