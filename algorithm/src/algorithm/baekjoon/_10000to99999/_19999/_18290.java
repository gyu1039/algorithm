package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _18290 {

    static int N, M, K;
    static int[][] arr;
    static int answer = Integer.MIN_VALUE;
    static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        isVisited = new boolean[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        rec(0, 0, 0, 0);

        System.out.println(answer);
    }

    private static void rec(int count, int row, int col, int sum) {

        if(count == K) {

            answer = Math.max(answer, sum);
            return;
        }

        for(int i=row; i<N; i++) {
            for(int j=col; j<M; j++) {

                if((i == 0 || !isVisited[i-1][j]) && (j == 0 || !isVisited[i][j-1])) {
                    isVisited[i][j] = true;
                    rec(count + 1, i, j + 1, sum + arr[i][j]);
                    isVisited[i][j] = false;
                }
            }
            col = 0;
        }

    }



}
