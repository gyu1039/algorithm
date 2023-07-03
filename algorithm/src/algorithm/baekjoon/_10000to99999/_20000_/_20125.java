package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _20125 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] body = new char[n+1][n+1];
        boolean isFind = false;
        int[] loc = new int[2];
        for(int i=1; i<body.length; i++) {

            char[] input = br.readLine().toCharArray();
            for(int j=1; j<body.length; j++) {
                body[i][j] = input[j-1];

                if(!isFind && body[i][j] == '*') {
                    isFind = true;
                    loc[0] = i+1;
                    loc[1] = j;
                }
            }
        }
        br.close();

        StringBuilder answer = new StringBuilder();
        answer.append(loc[0]).append(" ").append(loc[1]).append("\n");

        int width = 0;
        int idx = loc[1] - 1;
        while(idx >=0 && body[loc[0]][idx] == '*') {
            width += 1;
            idx -= 1;
        }
        answer.append(width).append(" ");

        width = 0;
        idx = loc[1] + 1;
        while(idx < n+1 && body[loc[0]][idx] == '*') {
            width += 1;
            idx += 1;
        }
        answer.append(width).append(" ");

        width = 0;
        idx = loc[0] + 1;
        while(idx < n + 1 && body[idx][loc[1]] == '*') {
            width += 1;
            idx += 1;
        }
        answer.append(width).append(" ");

        width = 0;
        int col = loc[1] - 1;
        int row = idx;
        while(row < n + 1 && body[row][col] == '*') {
            width += 1;
            row += 1;
        }
        answer.append(width).append(" ");

        width = 0;
        col = loc[1] + 1;
        row = idx;
        while(row < n+1 && body[row][col] == '*') {
            width += 1;
            row += 1;
        }
        answer.append(width);


        System.out.println(answer);

    }
}
