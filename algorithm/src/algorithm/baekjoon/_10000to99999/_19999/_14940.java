package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _14940 {

    static int n ,m;
    static int[][] map, result;
    static int[] rows = {-1, 0, 1, 0};
    static int[] cols = {0, 1, 0, -1};
    static boolean[][] isVisited;

    static class Pos {
        int row, col, w;

        Pos(int row, int col, int w) {
            this.row = row;
            this.col = col;
            this.w = w;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        result = new int[n][m];
        isVisited = new boolean[n][m];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Pos> q = new LinkedList<>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] == 2) {
                    result[i][j] = 0;
                    isVisited[i][j] = true;
                    q.add(new Pos(i, j, 0));
                    break;
                }
            }
        }

        while (!q.isEmpty()) {
            Pos cur = q.poll();

            for(int i=0; i<4; i++) {
                int nr = cur.row + rows[i];
                int nc = cur.col + cols[i];

                if(0 <= nr && nr < n
                        && 0 <= nc && nc < m
                    && !isVisited[nr][nc] && map[nr][nc] == 1) {

                    isVisited[nr][nc] = true;
                    result[nr][nc] = cur.w + 1;
                    q.add(new Pos(nr, nc, cur.w + 1));
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(!isVisited[i][j] && map[i][j] == 1) {
                    result[i][j] = -1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {

            for(int j=0; j<m; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }


}
