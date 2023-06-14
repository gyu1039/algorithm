package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1946 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] ar = new int[N+1];

            for(int i=0; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n1 = Integer.parseInt(st.nextToken());
                int n2 = Integer.parseInt(st.nextToken());
                ar[n1] = n2;
            }


            int count = 0;
            int min = Integer.MAX_VALUE;
            for(int i=1; i<=N; i++) {

                if(ar[i] < min) {
                    count += 1;
                    min = ar[i];
                }

            }

            sb.append(count).append("\n");
        }

        br.close();
        System.out.println(sb);
    }

}
