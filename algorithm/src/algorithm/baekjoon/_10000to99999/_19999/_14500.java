package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14500 {

    static int[][] arr;
    static int result;
    static int N, M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();


        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {

                if(col + 3 < M) {
                    result = Math.max(result, arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row][col + 3]);
                }

                if(row + 3 < N) {
                    result = Math.max(result, arr[row][col] + arr[row + 1][col] + arr[row + 2][col] + arr[row + 3][col]);
                }

                if(row + 1 < N && col + 1 < M) {
                    result = Math.max(result, arr[row][col] + arr[row][col + 1] + arr[row + 1][col] + arr[row + 1][col + 1]);
                }

                if(row - 1 >= 0 && col + 2 < M) {
                    int tmp = Math.max(arr[row - 1][col], arr[row - 1][col + 1]);
                    tmp = Math.max(tmp, arr[row - 1][col + 2]);

                    result = Math.max(result, arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + tmp);
                }

                if(row + 1 < N && col + 2 < M) {
                    int tmp = Math.max(arr[row + 1][col], arr[row + 1][col + 1]);
                    tmp = Math.max(tmp, arr[row + 1][col + 2]);

                    result = Math.max(result, arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + tmp);
                }

                if(row + 2 < N && col - 1 >= 0) {
                    int tmp = Math.max(arr[row][col - 1], arr[row + 1][col - 1]);
                    tmp = Math.max(tmp, arr[row+2][col - 1]);

                    result = Math.max(result, arr[row][col] + arr[row + 1][col] + arr[row + 2][col] + tmp);
                }

                if(row + 2 < N && col + 1 < M) {
                    int tmp = Math.max(arr[row][col + 1], arr[row + 1][col + 1]);
                    tmp = Math.max(arr[row+2][col +1], tmp);

                    result = Math.max(result, arr[row][col] + arr[row + 1][col] + arr[row + 2][col] + tmp);

                }

                if(row + 2 < N && col + 1 < M) {
                    result = Math.max(result, arr[row][col] + arr[row + 1][col] + arr[row + 1][col + 1] + arr[row + 2][col + 1]);
                }
                if(row + 2 < N && col - 1 >= 0) {
                    result = Math.max(result, arr[row][col] + arr[row + 1][col] + arr[row + 1][col - 1] + arr[row + 2][col - 1]);
                }
                if(row - 1 >= 0 && col + 2 < M) {
                    result = Math.max(result, arr[row][col] + arr[row][col + 1] + arr[row - 1][col + 1] + arr[row - 1][col + 2]);
                }
                if(row + 1 < N && col + 2 < M) {
                    result = Math.max(result, arr[row][col] + arr[row][col + 1] + arr[row + 1][col + 1] + arr[row + 1][col + 2]);
                }

            }
        }

        System.out.println(result);
    }
}
