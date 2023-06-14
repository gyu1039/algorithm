package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10162 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append(t / 300).append(" ");
        t %= 300;

        sb.append(t / 60).append(" ");
        t %= 60;

        sb.append(t / 10).append(" ");
        t %= 10;

        System.out.println(t == 0 ? sb.toString() : -1);
    }
}
