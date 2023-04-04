package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2776 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {

            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int M = Integer.parseInt(br.readLine());
            int[] arr2 = new int[M];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<M; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            for(int i=0; i<M; i++) {

                if(Arrays.binarySearch(arr, arr2[i]) < 0) {
                    sb.append("0\n");
                } else {
                    sb.append("1\n");
                }

            }
        }

        System.out.println(sb);

    }
}
