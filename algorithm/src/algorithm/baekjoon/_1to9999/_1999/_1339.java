package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1339 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }
        br.close();

        int[] num = new int[26];
        for(int i=0; i<n; i++) {
            int len = arr[i].length();
            int digit = (int)Math.pow(10, len-1);

            for(int j=0; j<len; j++) {
                num[arr[i].charAt(j) - 65] += digit;
                digit /= 10;
            }
        }

        Arrays.sort(num);
        int val = 9;
        int answer = 0;
        for(int i=num.length-1; i>=0; i--) {

            if(num[i] == 0) {
                break;
            }

            answer += num[i]*val;
            val -= 1;
        }

        System.out.println(answer);


    }
}
