package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2711 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            int idx = Integer.parseInt(input[0]);
            char[] arr = input[1].toCharArray();

            for(int j=0; j<arr.length; j++) {

                if(idx == j+1) {
                    continue;
                }
                sb.append(arr[j]);
            }
            sb.append("\n");
        }
        br.close();

        System.out.println(sb);

    }
}
