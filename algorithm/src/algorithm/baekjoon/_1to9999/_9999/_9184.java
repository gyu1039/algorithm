package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9184 {

    public static void main(String[] args) throws IOException {

        int[][][] arr = new int[21][21][21];
        for(int i=0; i<=20; i++) {
            for(int j=0; j<=20; j++) {
                for(int k=0; k<=20; k++) {

                    if(i == 0 || j == 0 || k == 0) {
                        arr[i][j][k] = 1;
                    } else if(i < j && j < k) {
                        arr[i][j][k] = arr[i][j][k-1] + arr[i][j-1][k-1] - arr[i][j-1][k];
                    } else {
                        arr[i][j][k] = arr[i-1][j][k] + arr[i-1][j-1][k] + arr[i-1][j][k-1] - arr[i-1][j-1][k-1];
                    }
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while(!(s = br.readLine()).equals("-1 -1 -1")) {

            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append("w(")
                    .append(a)
                    .append(", ")
                    .append(b)
                    .append(", ")
                    .append(c)
                    .append(") = ");

            if(a <= 0 || b <= 0 || c <= 0) {
                sb.append("1\n");
                continue;
            }

            if(a > 20 || b > 20 || c > 20) {
                a = b = c = 20;
                sb.append(arr[a][b][c]).append("\n");
            } else {
                sb.append(arr[a][b][c]).append("\n");
            }

        }
        br.close();

        System.out.println(sb);

    }

}
