package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9656 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int[] cache = new int[n + 2];
        cache[1] = 1;
        cache[2] = 2;

        for(int i=3; i<=n; i++) {
            cache[i] = Math.min(cache[i - 1], cache[i - 3]) + 1;
        }


        System.out.println(cache[n] % 2 == 1 ? "CY" : "SK");
    }
}
