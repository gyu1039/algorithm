package algorithm.baekjoon._1to9999._1999;

import java.io.*;
import java.util.StringTokenizer;

public class _1789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long S = Long.parseLong(br.readLine());
        br.close();

        long answer = 0;
        for(int i=1; i * (i+1) / 2 <= S; i++) {
            answer = i;
        }
        System.out.println(answer);


    }

}
