package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _18110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] ar = new int[n];
        for(int i=0; i<n; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ar);

        int exclusion = (int)Math.round(n * (double)30 / 100 / 2) ;

        int sum = 0;
        for(int i=exclusion; i<n-exclusion; i++) {
            sum += ar[i];
        }

        n -= exclusion * 2;
        System.out.println((int)Math.round((double)sum / n));
    }
}
