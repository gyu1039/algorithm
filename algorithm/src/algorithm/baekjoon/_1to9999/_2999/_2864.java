package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2864 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        br.close();

        int min = Integer.parseInt(input[0].replace('6', '5')) + Integer.parseInt(input[1].replace('6', '5'));
        int max = Integer.parseInt(input[0].replace('5', '6')) + Integer.parseInt(input[1].replace('5', '6'));

        System.out.println(min + " " + max);


    }
}
