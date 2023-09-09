package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1120 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String[] input = br.readLine().split(" ");
            String x = input[0];
            String y = input[1];

            int len1 = x.length();
            int len2 = y.length();

            int answer = 51;
            for(int i=0; i<len2 - len1 + 1; i++) {
                int tmp = 0;

                for(int j=0; j<len1; j++) {
                    if(x.charAt(j) != y.charAt(j+i)) {
                        tmp += 1;
                    }
                }

                answer = Math.min(tmp, answer);
            }

            System.out.println(answer);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
