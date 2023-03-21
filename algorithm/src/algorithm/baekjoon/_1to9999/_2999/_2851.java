package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2851 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[10];

        for(int i=0; i<ar.length; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int result = 0;
        for(int i=0; i<ar.length; i++) {
            int cond1 = Math.abs(100 - result);
            int cond2 = Math.abs(100 - (result + ar[i]));
            if(cond1 > cond2) {
                result += ar[i];
            } else if(cond1 == cond2) {
                result += ar[i];
                break;
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}
