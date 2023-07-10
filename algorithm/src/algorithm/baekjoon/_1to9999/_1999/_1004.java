package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1004 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        while(t-- > 0) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);

            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for(int i=0; i<n; i++) {
                input = br.readLine().split(" ");

                int cx = Integer.parseInt(input[0]);
                int cy = Integer.parseInt(input[1]);
                int r = Integer.parseInt(input[2]);

                double d1 = Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2);
                double d2 = Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2);

                if((d1 < r*r && d2 > r*r) || (d1 > r*r && d2 < r*r)) {
                    count += 1;
                }
            }

            answer.append(count).append("\n");
        }

        System.out.println(answer);
    }
}
