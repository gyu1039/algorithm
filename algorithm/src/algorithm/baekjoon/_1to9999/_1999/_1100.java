package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1100 {

    public static void main(String[] args) throws IOException {

        int answer = 0;
        final int num = 8;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<num; i++) {

            String s = br.readLine();
            for(int j=i%2; j<num; j+=2) {
                if(s.charAt(j) == 'F') {
                    answer += 1;
                }
            }
        }

        br.close();

        System.out.println(answer);
    }
}
