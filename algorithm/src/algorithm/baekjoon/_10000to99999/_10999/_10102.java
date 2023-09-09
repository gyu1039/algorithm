package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class _10102 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        br.close();

        int count = 0;
        for(char c : arr) {

            if(c == 'A') {
                count += 1;
            } else {
                count -= 1;
            }
        }

        System.out.println(count == 0 ? "Tie" : count > 0 ? "A" : "B");

    }
}
