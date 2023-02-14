package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _18290unsolved {

    static int N, M, K;
    static int[][] arr;
    static int result = Integer.MIN_VALUE;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
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

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                logic(i, j, 1, arr[i][j]);
            }
        }

        System.out.println(result);
    }

    private static void logic(int row, int col, int count, int sum) {

        isVisited[row][col] = true;

        if(count == K) {
            result = Math.max(sum, result);
            isVisited[row][col] = false;

            for(int i=0; i<4; i++) {

                int x = row + dx[i];
                int y = col + dy[i];

                if(0 <= x && x < N && 0 <= y && y < M) {
                    isVisited[x][y] = false;
                }
            }

            return;
        }

        for(int i=0; i<4; i++) {

            int x = row + dx[i];
            int y = col + dy[i];

            if(0 <= x && x < N && 0 <= y && y < M) {
                isVisited[x][y] = true;
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {

                if(row == i && col == j) {
                    continue;
                }

                if(!isVisited[i][j]) {
                    logic(i, j, count + 1, sum + arr[i][j]);
                }
            }
        }

        isVisited[row][col] = false;
        for(int i=0; i<4; i++) {

            int x = row + dx[i];
            int y = col + dy[i];

            if(0 <= x && x < N && 0 <= y && y < M) {
                isVisited[x][y] = false;
            }
        }
    }


}
