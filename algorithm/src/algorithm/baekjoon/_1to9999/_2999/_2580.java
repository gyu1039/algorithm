package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2580 {

    static int[][] ar = new int[9][9];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<9; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backtracking(0, 0);
    }

    static void backtracking(int row, int col) {

        if(col == 9) {
            backtracking(row+1, 0);
            return;
        }

        if(row == 9) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<9; i++) {
                for(int j=0; j<9; j++) {
                    sb.append(ar[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);

            System.exit(0);
        }

        if(ar[row][col] == 0) {
            for(int i=1; i<=9; i++) {
                if(isPossible(row, col, i)) {
                    ar[row][col] = i;
                    backtracking(row, col+1);
                }
            }
            ar[row][col] = 0;
            return;
        }

        backtracking(row, col+1);
    }

    static boolean isPossible(int row, int col, int value) {


        // 1
        for(int i=0; i<9; i++) {
            if(ar[row][i] == value) {
                return false;
            }
        }

        // 2
        for(int i=0; i<9; i++) {
            if(ar[i][col] == value) {
                return false;
            }
        }

        // 3
        int a = row/3 * 3;
        int b = col/3 * 3;

        for(int i=a; i<a+3; i++) {
            for(int j=b; j<b+3; j++) {
                if(ar[i][j] == value){
                    return false;
                }
            }
        }

        return true;
    }
}
