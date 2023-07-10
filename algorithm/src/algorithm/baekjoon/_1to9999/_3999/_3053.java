package algorithm.baekjoon._1to9999._3999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        double ret1 = Math.PI * n * n;
        double ret2 = 2. * n * n;
        System.out.printf("%.6f\n", ret1);
        System.out.printf("%.6f", ret2);

    }
}
