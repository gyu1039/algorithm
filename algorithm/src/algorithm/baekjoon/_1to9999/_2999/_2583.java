package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2583 {

    static int[] cols = {-1, 0, 1, 0};
    static int[] rows = {0, 1, 0, -1};
    static int m, n;
    static int[][] board;
    static boolean[][] isVisited;
    static int area;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        m = Integer.parseInt(input[0]);
        n = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        board = new int[m][n];
        for(int i=0; i<k; i++) {
            input = br.readLine().split(" ");
            int lx = Integer.parseInt(input[0]);
            int ly = Integer.parseInt(input[1]);
            int rx = Integer.parseInt(input[2]);
            int ry = Integer.parseInt(input[3]);

            for(int row=ly; row<ry; row++) {
                for(int col=lx; col<rx; col++) {
                    board[row][col] = 1;
                }
            }
        }
        br.close();

        isVisited = new boolean[m][n];
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        for(int i=0; i<m; i++) {

            for(int j=0; j<n; j++) {
                if(board[i][j] == 0 && !isVisited[i][j]) {
                    answer += 1;
                    isVisited[i][j] = true;
                    area = 1;
                    dfs(i, j);
                    list.add(area);
                    area = 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answer).append("\n");
        Collections.sort(list);
        for(int n : list) {
            sb.append(n).append(" ");
        }
        System.out.println(sb);
    }

    static void dfs(int row, int col) {

        for(int i = 0; i< cols.length; i++) {

            int rw = row + rows[i];
            int cl = col + cols[i];

            if (0 <= rw && rw < m && 0 <= cl && cl < n
                    && board[rw][cl] == 0 && !isVisited[rw][cl]) {
                area += 1;
                isVisited[rw][cl] = true;
                dfs(rw, cl);
            }

        }
    }
}
