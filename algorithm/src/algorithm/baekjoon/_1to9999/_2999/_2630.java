package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class _2630 {

    static int[][] arr;
    static int[] result = new int[2];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        rec(0, 0, n);

        System.out.println(result[0] + "\n" + result[1]);
    }

    static void rec(int row, int col, int size) {

        int c = arr[row][col];


        for(int i=row; i<row+size; i++) {
            for(int j=col; j<col+size; j++) {

                if(c != arr[i][j]) {
                    rec(row, col, size/2);
                    rec(row, col+size/2, size/2);
                    rec(row+size/2, col, size/2);
                    rec(row+size/2, col+size/2, size/2);
                    return;
                }
            }
        }

        result[c] += 1;
    }
}
