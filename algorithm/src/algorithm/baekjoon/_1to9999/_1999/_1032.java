package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        int len = arr[0].length();
        for(int i=0; i<len; i++) {
            boolean isSame = true;
            char prev = arr[0].charAt(i);
            for(int j=1; j<n; j++) {
                if(prev != arr[j].charAt(i)) {
                    isSame = false;
                    break;
                }
            }

            sb.append(isSame ? prev : '?');
        }

        System.out.println(sb);
    }
}
