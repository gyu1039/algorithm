package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int num = N;
        int tmp = 0;
        do {
            tmp = num / 10;
            tmp += num % 10;

            num = 10 * (num % 10) + tmp % 10;

            count++;
        } while (num != N);

        System.out.println(count);
    }

}
