package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1009 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(testCases-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a % 10 == 0) {
                sb.append(10).append("\n");
                continue;
            }

            int b = Integer.parseInt(st.nextToken());
            a %= 10;
            int num = a;
            for(int i=1; i<b; i++) {
                num = num * a % 10;
            }
            sb.append(num).append("\n");
        }
        br.close();

        System.out.println(sb);
    }
}
