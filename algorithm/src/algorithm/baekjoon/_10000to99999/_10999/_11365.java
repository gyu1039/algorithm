package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11365 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringBuilder answer = new StringBuilder();
            String s;
            while(!(s = br.readLine()).equals("END")) {

                int len = s.length();
                for(int i=len-1; i>=0; i--) {
                    answer.append(s.charAt(i));
                }
                answer.append("\n");

            }

            System.out.println(answer);
        } catch (IOException e) {

        }
    }
}
