package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2468 {

    static int[][] ar;
    static boolean[][] isVisited;
    static int result = 1;
    static int N;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ar = new int[N][N];

        int min = 101;
        int max = 0;
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());

                if(min > ar[i][j]) {
                    min = ar[i][j];
                }

                if(max < ar[i][j]) {
                    max = ar[i][j];
                }
            }
        }

        for(int height=min-1; height<max+1; height++){
            isVisited = new boolean[N][N];

            int size = 0;
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if (!isVisited[i][j] && ar[i][j] > height) {
                        size += dfs(height, i, j);
                    }
                }
            }
            result = Math.max(result, size);
        }

        System.out.println(result);
    }

    private static int dfs(int height, int i, int j) {

        isVisited[i][j] = true;

        for(int a=0; a<4; a++) {
            int x = i + dx[a];
            int y = j + dy[a];

            if(0 <= x && x < N && 0 <= y && y < N
                    && !isVisited[x][y] && ar[x][y] > height) {
                dfs(height, x, y);
            }
        }

        return 1;
    }


}


