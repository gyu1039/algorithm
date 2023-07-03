package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1051 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        br.close();

        int answer = 1;
        for(int i=0; i<n; i++) {

            for(int j=0; j<m; j++) {

                for(int l=1; i+l<n && j+l<m; l++) {

                    if(arr[i][j] == arr[i+l][j]
                            && arr[i][j] == arr[i][j+l]
                            && arr[i][j] == arr[i+l][j+l]) {

                        answer = Math.max((l+1)*(l+1), answer);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
