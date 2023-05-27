package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9663 {

    static boolean[][] board;
    static int answer, n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
        board = new boolean[n][n];

        backtracking(0);

        System.out.println(answer);
    }

    static void backtracking(int row) {

        if(row == n) {
            answer += 1;
            return;
        }

        for(int i=0; i<n; i++) {

            if(checking(row, i)) {
                board[row][i] = true;
//                System.out.println(String.format("row: %d, col: %d", row, i));
                backtracking(row+1);
                board[row][i] = false;
            }
//            System.out.println(String.format("--------%d, %d", row, i));
        }
    }

    static boolean checking(int row, int col) {

        // 12시 방향 검사
        int a = 0;
        while(a < row) {

            if(board[a][col]) {
                return false;
            }
            a += 1;
        }

        // 대각 오른쪽 위 방향 검사
        a = row-1;
        int b = col + 1;
        while(0 <= a && b < n) {

            if(board[a][b]) {
                return false;
            }
            a -= 1;
            b += 1;
        }

        // 3시 방향 검사
        b = col+1;
        while(b < n) {

            if(board[row][b]) {
                return false;
            }

            b += 1;
        }

        // 오른쪽 대각 아래 검사
        a = row + 1;
        b = col + 1;
        while(a < n && b < n) {

            if(board[a][b]) {
                return false;
            }

             a += 1;
             b += 1;
        }

        // 6시 방향 검사
        a = row+1;
        while(a < n) {

            if(board[a][col]) {
                return false;
            }

            a += 1;
        }

        // 대각 왼쪽 아래 검사
        a = row+1;
        b = col-1;
        while(a < n && 0 <= b) {

            if(board[a][b]) {
                return false;
            }

            a += 1;
            b -= 1;
        }

        // 9시 방향 검사
        b = 0;
        while(b < col) {

            if(board[row][b]) {
                return false;
            }

            b += 1;
        }

        // 대각 왼쪽 위 방향 검사
        a = row-1;
        b = col-1;
        while(0 <= a && 0 <= b) {

            if(board[a][b]) {
                return false;
            }

            a -= 1;
            b -= 1;
        }

        return true;
    }

}
