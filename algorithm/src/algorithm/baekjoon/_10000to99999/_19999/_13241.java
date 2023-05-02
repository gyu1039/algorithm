package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13241 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        System.out.println(a * b / gcd(a,b));
    }

    public static long gcd(long a, long b) {

        if(a < b) {
            long tmp = b;
            b = a;
            a = tmp;
        }

        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }
}
