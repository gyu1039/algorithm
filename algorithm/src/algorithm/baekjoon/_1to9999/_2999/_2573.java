package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2573 {

    static int n, m, answer;
    static int[][] arr;
    static int[] rows, cols;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        arr = new int[n][m];
        for(int i=0; i<n; i++) {
            input = br.readLine().split(" ");
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        br.close();

        answer = 0;

        rows = new int[]{-1, 0, 1, 0};
        cols = new int[]{0, 1, 0, -1};

        int cnt = 0;
        while((cnt = isSeparated()) < 2) {

            if(cnt == 0) {
                answer = 0;
                break;
            }
            melting();
            answer += 1;
        }

        System.out.println(answer);
    }

    static void melting() {

        Queue<Loc> q = new LinkedList<>();
        boolean[][] cantGo = new boolean[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {

                if(arr[i][j] > 0) {
                    q.add(new Loc(i, j));
                }
            }
        }

        while (!q.isEmpty()) {
            Loc cur = q.poll();


            for(int i=0; i<rows.length; i++) {
                int nextR = cur.row + rows[i];
                int nextC = cur.col + cols[i];

                if(0 <= nextR && nextR < n && 0 <= nextC && nextC < m
                    && arr[nextR][nextC] == 0 && !cantGo[nextR][nextC]) {

                    if(arr[cur.row][cur.col] > 0) {
                        arr[cur.row][cur.col] -= 1;
                    }

                    if(arr[cur.row][cur.col] == 0) {
                        cantGo[cur.row][cur.col] = true;

                    }

                }

            }
        }
    }

    static int isSeparated() {

        Queue<Loc> q = new LinkedList<>();
        boolean[][] isVisited = new boolean[n][m];
        int numberOfIsland = 0;

        for(int i=0; i<n; i++) {

            for(int j=0; j<m; j++) {

                if(arr[i][j] != 0 && !isVisited[i][j]) {
                    q.add(new Loc(i, j));
                    isVisited[i][j] = true;

                    while (!q.isEmpty()) {
                        Loc cur = q.poll();

                        for(int k=0; k<rows.length; k++) {

                            int nextR = cur.row + rows[k];
                            int nextC = cur.col + cols[k];

                            if(0 <= nextR && nextR < n && 0 <= nextC && nextC < m
                                    && arr[nextR][nextC] > 0 && !isVisited[nextR][nextC]) {

                                q.add(new Loc(nextR, nextC));
                                isVisited[nextR][nextC] = true;
                            }

                        }

                    }

                    numberOfIsland += 1;
                }

            }
        }

        return numberOfIsland;

    }

    static class Loc {
        int row, col;

        public Loc(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
