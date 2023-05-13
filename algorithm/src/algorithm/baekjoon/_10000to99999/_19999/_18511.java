package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _18511 {

    static int[] ar;
    static int N, K;
    static int result ;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ar = new int[K];
        for(int i=0; i<K; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        rec( 0);

        System.out.println(result);
    }

    public static void rec(int n) {

        if(n <= N) {
            result = Math.max(result, n);
        }

        if(n > N) {
            return;
        }

        for(int i=0; i<ar.length; i++) {
            rec(n * 10 + ar[i]);
        }

    }
}
