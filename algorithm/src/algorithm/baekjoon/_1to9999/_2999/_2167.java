package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2167 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] arr = new int[Integer.parseInt(st.nextToken())+1][Integer.parseInt(st.nextToken())+1];

        for(int row=1; row<arr.length; row++) {

            st = new StringTokenizer(br.readLine());

            for(int col=1; col<arr[0].length; col++ ){
                arr[row][col] = Integer.parseInt(st.nextToken());
            }
        }

        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int sum = 0;

            for(int row=i; row<=x; row++) {

                for(int col=j; col<=y; col++) {
                    sum += arr[row][col];
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
