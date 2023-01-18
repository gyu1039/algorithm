package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14500unsolved {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {

                if(j+3 < M) {
                    result = Math.max(result, arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i][j+3]);
                }

                if(i+3 < N) {
                    result = Math.max(result, arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+3][j]);
                }

                if(i+1<N && j+1<M) {
                    result = Math.max(result, arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j]);
                }

                if(i+3<N && j+1<M) {
                    result = Math.max(result, arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j+1]);
                }

                if(i+3<N && j-1>0) {
                    result = Math.max(result, arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j-1]);
                }

                if(i-3>0 && j+1<M) {
                    result = Math.max(result, arr[i][j] + arr[i-1][j] + arr[i-2][j] + arr[i-2][j+1]);
                }

                if(i-3>0 && j-1>0) {
                    result = Math.max(result, arr[i][j] + arr[i-1][j] + arr[i-2][j] + arr[i-2][j-1]);
                }

                if(i-2>0 && j-1>0) {
                    result = Math.max(result, arr[i][j] + arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j-2]);
                }

                if(i-2>0 && j+1<M) {
                    result = Math.max(result, arr[i][j] + arr[i-1][j] + arr[i-1][j+1] + arr[i-2][j+1]);
                }

                if(i+2<N && j-1>0) {
                    result = Math.max(result, arr[i][j] + arr[i+1][j] + arr[i+1][j-1] + arr[i+2][j-1]);
                }

                if(i+2<N && j+1<M) {
                    result = Math.max(result, arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j+1]);
                }

                if(i+1<N && j+2<M) {
                    result = Math.max(result, arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]);
                }

                if(i+2<N && j-1>0) {
                    result = Math.max(result, arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+1][j-1]);
                }

                if(i-1>0 && j-2>=0) {
                    result = Math.max(result, arr[i][j] + arr[i][j-1] + arr[i][j-2] + arr[i-1][j-1]);
                }

                if(i-1>0 && j+2<M) {
                    result = Math.max(result, arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i-1][j+1]);
                }
            }
        }
        System.out.println(result);
    }

}
