package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11758 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int x2 = Integer.parseInt(input[0]);
        int y2 = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int x3 = Integer.parseInt(input[0]);
        int y3 = Integer.parseInt(input[1]);
        br.close();

        int answer = -2;
        int a = x1*y2 + x2*y3 + x3*y1;
        int b = y1*x2 + y2*x3 + y3*x1;
        if(a - b > 0) { // 반시계 방향
            answer = 1;

        } else if(a == b) { // 평행
            answer = 0;

        } else { // 시계 방향
            answer = -1;
        }

        System.out.println(answer);
    }
}
