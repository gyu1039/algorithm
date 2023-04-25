package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int[] ar = new int[X+1];
        int[] arRev = new int[X+1];
        int row = 0;
        int col = 0;

        outer: for(int i=1; true; i++) {

            int idx = 1 + (i-1)*i/2;
            int start = idx;

            for(int j=1; j<=i; j++) {
                ar[idx] = j;
                arRev[idx] = i - (j - 1);
                idx++;
                if(idx > X) {

                    if(i % 2 == 0) {
                        row = ar[idx-1];
                        col = arRev[idx - 1];

                    } else {
                        row = arRev[idx - 1];
                        col = ar[idx-1];
                    }

                    break outer;
                }
            }
        }

        System.out.println(row + "/" + col);

    }
}
