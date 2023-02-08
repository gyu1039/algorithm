package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1284 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int ret = 1;

            while(n > 0) {
                int _1 = n % 10;
                if(_1 == 1) {
                    ret += 2;
                } else if(_1 == 0) {
                    ret += 4;
                } else {
                    ret += 3;
                }
                ret++;
                n /= 10;
            }

            sb.append(ret).append("\n");
            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);

    }
}
