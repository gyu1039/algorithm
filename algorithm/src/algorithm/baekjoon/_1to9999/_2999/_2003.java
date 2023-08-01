package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        input = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        br.close();

        int left = 0, right = 0, sum = 0, answer = 0;

        while(true) {

            if(sum >= m) {
                if(sum == m) {
                    answer += 1;
                }

                sum -= arr[left];
                left += 1;

            } else {

                if(right == n) {
                    break;
                }

                sum += arr[right];
                right += 1;
            }
        }

        System.out.println(answer);

    }
}
