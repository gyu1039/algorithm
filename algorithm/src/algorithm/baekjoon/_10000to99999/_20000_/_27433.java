package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27433 {

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println(factorial(N));
    }

    private static long factorial(int n) {

        if(n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
