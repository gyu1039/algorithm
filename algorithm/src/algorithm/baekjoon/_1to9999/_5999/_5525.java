package algorithm.baekjoon._1to9999._5999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        char[] ar = br.readLine().toCharArray();
        br.close();

        int answer = 0;
        int accumulation = 0;
        for(int i=2; i<m; i++) {

            if (ar[i] == 'I' && ar[i - 1] == 'O' && ar[i - 2] == 'I') {
                accumulation += 1;
                i += 1;
            } else {
                accumulation = 0;
            }

            if(accumulation >= n) {
                answer += 1;
            }
        }

        System.out.println(answer);



    }
}
