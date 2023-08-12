package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2485 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] input = new int[N];
        for(int i=0; i<N; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(input);

        int[] difference = new int[N-1];
        for(int i=0; i<N-1; i++) {
            difference[i] = input[i+1] - input[i];
        }

        int g = difference[0];

        for(int i=1; i<difference.length; i++) {
            g = gcd(difference[i], g);
        }


        System.out.println((input[N-1] - input[0])/g - N + 1);
    }

    private static int gcd(int a, int b) {

        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
