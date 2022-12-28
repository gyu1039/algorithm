package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _17103 {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        final int MAX = 1_000_000 + 1;

        boolean[] isPrime = new boolean[MAX];
        Arrays.fill(isPrime, true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2; i*i<isPrime.length; i++) {

            if(isPrime[i]) {
                for (int j = i*i; j<isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (testCase-- > 0) {

            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            for(int i=2; i<=n/2; i++) {
                if(isPrime[i] && isPrime[n-i]) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
