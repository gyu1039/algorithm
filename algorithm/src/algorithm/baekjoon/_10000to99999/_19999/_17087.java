package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _17087 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] f = br.readLine().split(" ");
        int N = Integer.parseInt(f[0]);
        int S = Integer.parseInt(f[1]);

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            list.add(Math.abs(n - S));
        }

        int result = list.get(0);
        for(int i=1; i<N; i++) {
            result = gcd(list.get(i), result);
        }



        System.out.println(result);
    }

    public static int gcd(int a, int b) {

        if(b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if(b == 0) {
            return a;
        }

        return gcd(b, a%b);
    }
}
