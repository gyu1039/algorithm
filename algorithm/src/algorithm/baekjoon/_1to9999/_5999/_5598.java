package algorithm.baekjoon._1to9999._5999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5598 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        br.close();

        StringBuilder sb = new StringBuilder();
        for(char c : arr) {
            sb.append(c <= 'C' ? (char)(88 + c % 65) : (char)(c - 3));
        }

        System.out.println(sb);
    }
}
