package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1735 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        a1 = a2 * b1 + a1 * b2;
        a2 = a2 * b2;


        int n = gcd(a1, a2);

        System.out.println(a1 / n + " " + (a2 / n));
    }

    private static int gcd(int a1, int a2) {

        if(a1 < a2) {
            int tmp = a1;
            a1 = a2;
            a2 = tmp;
        }

        if(a2 == 0) {
            return a1;
        }

        return gcd(a2, a1 % a2);
    }
}
