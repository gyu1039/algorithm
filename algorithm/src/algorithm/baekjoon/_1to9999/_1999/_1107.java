package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _1107 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] input = null;
        if(m != 0) {
            input = br.readLine().split(" ");
        }
        br.close();

        if(n == 100) {
            System.out.println(0);
            return;
        }

        boolean[] isNot = new boolean[10];
        for(int i=0; i<m; i++) {
            isNot[Integer.parseInt(input[i])] = true;
        }

        int curChannel = n;
        int answer = 0;
        while(curChannel != n) {


        }


        System.out.println(answer);
    }
}
