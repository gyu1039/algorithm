package algorithm.baekjoon._1to9999._3999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] answer = new int[]{1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<answer.length; i++) {
            int n = Integer.parseInt(st.nextToken());
            sb.append(answer[i] - n).append(" ");
        }

        System.out.println(sb);
    }
}
