package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2669 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[101][101];

        for(int i=0; i<4; i++) {

            String[] input = br.readLine().split(" ");
            int lx = Integer.parseInt(input[0]);
            int ly = Integer.parseInt(input[1]);
            int rx = Integer.parseInt(input[2]);
            int ry = Integer.parseInt(input[3]);

            for(int y = ly; y<ry; y++) {

                for(int x=lx; x<rx; x++) {
                    arr[y][x] = 1;
                }
            }
        }
        br.close();

        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i][j] == 1) {
                    sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}
