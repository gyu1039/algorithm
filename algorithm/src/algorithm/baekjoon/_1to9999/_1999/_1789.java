package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] ar = new int[N][N];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        int[] result = new int[3];
        rec(N, 0, 0, ar, result);

        StringBuilder sb = new StringBuilder();
        for(int n : result) {
            sb.append(n).append("\n");
        }

        System.out.println(sb);
    }

    public static void rec(int N, int row, int col, int[][] ar, int[] result) {

        int value = ar[row][col];
        for(int i=row; i<row+N; i++) {
            for(int j=col; j<col+N; j++) {
                if(value != ar[i][j]) {

                    for(int k=0; k<3; k++) {
                        for(int l=0; l<3; l++) {
                            rec(N/3, row + N/3 * k, col + N/3 * l, ar, result);
                        }
                    }

                    return;
                }
            }
        }

        result[value+1] += 1;
    }
}
