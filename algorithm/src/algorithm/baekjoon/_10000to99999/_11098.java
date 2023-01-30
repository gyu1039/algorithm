package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11098 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(testCases-- > 0) {
            int p = Integer.parseInt(br.readLine());
            int maxPrice = Integer.MIN_VALUE;
            String maxName = "";
            while(p-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                if(price > maxPrice) {
                    maxName = st.nextToken();
                    maxPrice = price;
                }
            }
            sb.append(maxName).append("\n");
        }

        System.out.println(sb);
    }
}
