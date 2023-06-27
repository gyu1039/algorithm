package algorithm.baekjoon._1to9999._7999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _7569 {

    static class Loc {

        int height, col, row, days;

        public Loc(int height, int row, int col, int days) {
            this.height = height;
            this.row = row;
            this.col = col;
            this.days = days;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int[][][] ar = new int[height][row][col];
        Queue<Loc> q = new LinkedList<>();
        int total = 0;
        for(int i=0; i<height; i++) {

            for(int j=0; j<row; j++) {

                st = new StringTokenizer(br.readLine());
                for(int k=0; k<col; k++) {
                    ar[i][j][k] = Integer.parseInt(st.nextToken());

                    if(ar[i][j][k] == 0 || ar[i][j][k] == 1) {
                        total += 1;
                    }

                    if(ar[i][j][k] == 1) {
                        q.add(new Loc(i, j, k, 0));
                    }
                }
            }
        }
        br.close();

        boolean[][][] isVisited = new boolean[height][row][col];
        int[] heights = {1, -1, 0, 0, 0, 0};
        int[] cols = {0, 0, -1, 0, 1, 0};
        int[] rows = {0, 0, 0, 1, 0, -1};

        int answer = 0;
        if (!q.isEmpty()) {
            isVisited[q.peek().height][q.peek().row][q.peek().col] = true;
        }

        while (!q.isEmpty()) {
            total -= 1;
            Loc cur = q.poll();
            answer = Math.max(answer, cur.days);

            for(int i=0; i<cols.length; i++) {
                int h = cur.height + heights[i];
                int r = cur.row + rows[i];
                int c = cur.col + cols[i];

                if(0 <= h && h < height && 0 <= c && c < col && 0 <= r && r < row
                    && ar[h][r][c] == 0 && !isVisited[h][r][c]) {

                    ar[h][r][c] = 1;
                    isVisited[h][r][c] = true;
                    q.add(new Loc(h, r, c, cur.days + 1));
                }
            }
        }

        System.out.println(total == 0 ? answer : -1);
    }
}
