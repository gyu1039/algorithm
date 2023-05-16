package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2447 {

    static char[][] ar;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ar = new char[N][N];
        br.close();

        rec(N, 0, 0, false);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                sb.append(ar[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void rec(int n, int row, int col, boolean isEmpty) {

        if(!isEmpty && n > 1) {
            rec(n/3, row, col, false);
            rec(n/3, row, col + n/3, false);
            rec(n/3, row, col + n/3 * 2, false);
            rec(n/3, row + n/3, col, false);
            rec(n/3, row + n/3, col + n/3, true);
            rec(n/3, row + n/3, col + n/3 * 2, false);
            rec(n/3, row + n/3 * 2, col, false);
            rec(n/3, row + n/3 * 2, col + n/3, false);
            rec(n/3, row  + n/3 * 2, col + n/3 * 2, false);

            return;
        }


        if(!isEmpty) {
            for(int i=row; i<row+n; i++) {
                for(int j=col; j<col+n; j++) {
                    ar[i][j] = '*';
                }
            }

        } else {
            for(int i=row; i<row+n; i++) {
                for(int j=col; j<col+n; j++) {
                    ar[i][j] = ' ';
                }
            }
        }





    }
}
