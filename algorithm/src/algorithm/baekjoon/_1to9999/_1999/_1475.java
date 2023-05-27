package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1475 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int[] ar = new int[10];
        while(n > 0) {

            int _1 = n % 10;

            ar[_1] += 1;
            n /= 10;
        }

        int q = (ar[6] + ar[9]) / 2;
        int r = (ar[6] + ar[9]) % 2;

        ar[6] = ar[9] = q;
        ar[6] += r;

        int answer = 0;
        for(int i=0; i<10; i++) {
            if(answer < ar[i]) {
                answer = ar[i];
            }
        }

        System.out.println(answer);

    }
}
