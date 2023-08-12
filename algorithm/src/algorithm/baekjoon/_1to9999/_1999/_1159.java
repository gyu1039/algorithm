package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1159 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        for(int i=0; i<n; i++) {
            arr[br.readLine().charAt(0) - 'a']++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= 5) {
                sb.append((char)('a' + i));
            }
        }

        System.out.println(sb.length() == 0 ? "PREDAJA" : sb);
    }
}
