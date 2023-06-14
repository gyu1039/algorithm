package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11051 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        if(N == K || K == 0) {
            System.out.println(1);
            return;
        }

        int[][] bc = new int[N+1][];

        for(int i=0; i<=N; i++) {
            bc[i] = new int[i+1];
            bc[i][0] = 1;
            bc[i][i] = 1;

        }

        for(int i=2; i<=N; i++) {

            for(int j=1; j<i; j++) {
                bc[i][j] = (bc[i-1][j-1] + bc[i-1][j]) % 10_007;

                if(i == N && j == K) {
                    System.out.println(bc[N][K]);
                    return;
                }
            }
        }


    }
}
