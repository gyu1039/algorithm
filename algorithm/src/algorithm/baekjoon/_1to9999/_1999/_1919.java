package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1919 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        br.close();

        int[] counter = new int[26];

        for(int i=0; i<arr1.length; i++) {
            counter[arr1[i] - 'a'] += 1;
        }

        for(int i=0; i<arr2.length; i++) {
            counter[arr2[i] - 'a'] -= 1;
        }

        int sum = 0;
        for(int i=0; i<counter.length; i++) {
            sum += Math.abs(counter[i]);
        }
        System.out.println(sum);



    }
}
