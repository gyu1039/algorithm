package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(br.readLine());

        int[][] words = new int[input.length() + 1][26];

        for (int i=1; i<words.length; i++) {

            for (int j=0; j<words[i].length; j++) {
                words[i][j] = words[i - 1][j];
            }

            words[i][input.charAt(i - 1) - 'a'] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            String[] arr = br.readLine().split(" ");
            char c = arr[0].charAt(0);
            int l = Integer.parseInt(arr[1]);
            int r = Integer.parseInt(arr[2]);

            sb.append(words[r+1][c - 'a'] - words[l][c - 'a']).append("\n");
        }
        br.close();

        System.out.println(sb);

    }
}
