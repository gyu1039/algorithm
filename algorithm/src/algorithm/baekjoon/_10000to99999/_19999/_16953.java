package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _16953 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int answer = -1;
        int count = 1;
        while (a < b) {

            if(b % 2 == 0) {
                b /= 2;
            } else if(b % 10 == 1) {
                b /= 10;
            } else {
                break;
            }

            count += 1;
        }

        if(a == b) {
            answer = count;
        }

        System.out.println(answer);
    }
}
