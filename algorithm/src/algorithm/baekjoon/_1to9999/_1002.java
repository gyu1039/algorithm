package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1002 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(testCases-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double d = Math.sqrt((x1 - x2) * (x1 -x2) + (y1 - y2) * (y1 - y2));

            if(x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append("-1\n");
            } else if(d < r1 || d < r2) {
                int largeR = Math.max(r1, r2);
                int smallR = Math.min(r1, r2);

                if(d + smallR < largeR) {
                    sb.append("0\n");
                } else if(d + smallR == largeR) {
                    sb.append("1\n");
                } else if(d + smallR > largeR) {
                    sb.append("2\n");
                }
            } else {

                if (d > r1 + r2) {
                    sb.append("0\n");
                } else if (d == r1 + r2) {
                    sb.append("1\n");
                } else if (d < r1 + r2) {
                    sb.append("2\n");
                }
            }

        }

        System.out.println(sb);

    }
}
