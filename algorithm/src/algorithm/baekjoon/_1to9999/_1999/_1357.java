package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1357 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");

            int x = Integer.parseInt(new StringBuilder(input[0]).reverse().toString());
            int y = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
            StringBuilder reverse = new StringBuilder(x + y + "").reverse();

            System.out.println(Integer.parseInt(reverse.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
