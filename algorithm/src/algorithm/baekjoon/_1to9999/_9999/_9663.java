package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9663 {

    static int[] board;
    static int answer, n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
        board = new int[n];

        backtracking(0);

        System.out.println(answer);
    }

    static void backtracking(int idx) {

        if(idx == n) {
            answer += 1;
            return;
        }

        for(int i=0; i<n; i++) {

            board[idx] = i;
            if(checking(idx)) {
                backtracking(idx+1);
            }
        }
    }

    static boolean checking(int row) {

        for(int i=0; i<row; i++) {

            int c = Math.abs(board[row] - board[i]);
            if(board[row] == board[i] || row - i == c) {
                return false;
            }
        }
        return true;
    }

}
