package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _18870 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ar = new int[N];
        int[] ar2 = new int[N];
        Map<Integer, Integer> subtotal = new HashMap<>();

        for(int i=0; i<N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
            ar2[i] = ar[i];
        }
        br.close();
        Arrays.sort(ar);

        subtotal.put(ar[0], 0);
        for(int i=1; i<N; i++) {
            if(ar[i] == ar[i-1]) {
               continue;
            }

            subtotal.put(ar[i], subtotal.get(ar[i - 1]) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            sb.append(subtotal.get(ar2[i])).append(" ");
        }
        System.out.println(sb);
    }
}
