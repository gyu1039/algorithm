package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15904 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        br.close();

        char[] UCPC = {'U', 'C', 'P', 'C'};
        int idx = 0;
        for(char c : arr) {
            if(c == UCPC[idx]) {
                idx += 1;
                if(idx == 4) {
                    break;
                }
            }
        }

        System.out.println(idx == 4 ? "I love UCPC" : "I hate UCPC");


    }
}
