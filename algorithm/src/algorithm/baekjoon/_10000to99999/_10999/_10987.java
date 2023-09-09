package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10987 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        br.close();

        int answer = 0;
        for(char c : arr) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                answer += 1;
            }
        }

        System.out.println(answer);

    }
}
