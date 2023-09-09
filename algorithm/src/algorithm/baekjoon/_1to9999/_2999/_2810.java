package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2810 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();

        int numberOfCupHolders = 1;
        for(int i=0; i<N; i++) {
            if(s.charAt(i) == 'S') {
                numberOfCupHolders += 1;
            } else {
                numberOfCupHolders += 1;
                i += 1;
            }
        }

        System.out.println(numberOfCupHolders < N ? numberOfCupHolders : N);
    }
}
