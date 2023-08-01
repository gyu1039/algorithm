package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1449 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int l = Integer.parseInt(input[1]);
        final int limit = 1001;
        input = br.readLine().split(" ");
        br.close();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);

        int answer = 1;
        int loc = arr[0] + l - 1;
        for(int i=1; i<n; i++) {

            if(arr[i] > loc) {
                loc = arr[i] + l - 1;
                answer += 1;
            }

        }


        System.out.println(answer);
    }
}
