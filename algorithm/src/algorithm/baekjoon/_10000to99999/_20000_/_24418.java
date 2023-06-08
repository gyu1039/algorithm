package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _24418 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

//        int[][] ar = new int[n][n];
//        for(int i=0; i<n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for(int j=0; j<n; j++) {
//                ar[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
        for(int i=0; i<n; i++) {
            br.readLine();
        }

        int[][] cache = new int[n+1][n+1];
        for(int i=0; i<=n; i++) {
            cache[0][i] = 1;
            cache[i][0] = 1;
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                cache[i][j] = cache[i - 1][j] + cache[i][j - 1];
            }
        }

        System.out.println(String.format("%d %d", cache[n][n], n * n));
    }
}
