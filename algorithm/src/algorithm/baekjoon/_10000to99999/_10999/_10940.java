package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10940 {

    static char[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new char[4*n-3][4*n-3];

        for(int i=0; i<4*n -3; i++) {
            for(int j=0; j<4*n -3; j++) {
                arr[i][j] = ' ';
            }
        }

        rec(n, 0, 0);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<4*n -3; i++) {
            for(int j=0; j<4*n -3; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void rec(int n, int row, int col) {

        if(n == 0) {
            return;
        }

        for(int i=col; i<col + 4*n-3; i++) {
            arr[row][i] = '*';
            arr[row + 4*n-4][i] = '*';
        }

        for(int i=row; i<row + 4*n-3; i++) {
            arr[i][col] = '*';
            arr[i][col + 4*n-4] = '*';
        }

        rec(n-1, row+2, col+2);
    }
}
