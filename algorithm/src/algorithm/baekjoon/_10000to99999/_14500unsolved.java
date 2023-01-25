package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14500unsolved {

    static int[][] arr;
    static boolean[][] isVisited;
    static int[] directionX = {0, 1, 0, -1};
    static int[] directionY = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N+2][M+2];
        isVisited = new boolean[N+2][M+2];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        int result = 0;

        for(int row=1; row<=N; row++) {
            for(int col=1; col<=M; col++) {


            }
        }

        System.out.println(result);
    }

}
