package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1652 {

    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(br.readLine());
            char[][] arr = new char[n][n];
            for(int i=0; i<n; i++) {
                char[] tmp = br.readLine().toCharArray();
                for(int j=0; j<n; j++) {
                    arr[i][j] = tmp[j];
                }
            }

            int rowAnswer = 0;
            for(int row=0; row<n; row++) {

                boolean isContinuous = false;
                for(int col=0; col<n-1; col++) {

                    if(arr[row][col] == '.' && arr[row][col+1] == '.' ) {
                        rowAnswer = !isContinuous ? rowAnswer + 1 : rowAnswer;
                        isContinuous = true;
                    } else {
                        isContinuous = false;
                    }
                }
            }

            int colAnswer = 0;
            for(int col=0; col<n; col++) {

                boolean isContinuous = false;
                for(int row=0; row<n-1; row++) {

                    if(arr[row][col] == '.' && arr[row+1][col] == '.') {
                        colAnswer = !isContinuous ? colAnswer += 1 : colAnswer;
                        isContinuous = true;
                    } else {
                        isContinuous = false;
                    }
                }
            }


            System.out.println(rowAnswer + " " + colAnswer);
        } catch (IOException e) {

        }

    }
}
