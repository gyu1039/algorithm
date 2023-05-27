package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _14888 {

    static int[] arr;
    static int[] operators;
    static int n;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        operators = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            int cnt = Integer.parseInt(st.nextToken());
            operators[i] = cnt;
        }
        br.close();

        backtracking(0, arr[0]);

        System.out.println(max + "\n" + min);

    }

    static void backtracking(int size, int sum) {

        if(size == n-1) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);

            return;
        }

        if(operators[0] > 0) {
            operators[0] -= 1;
            backtracking(size+1, sum + arr[size+1]);
            operators[0] += 1;
        }

        if(operators[1] > 0) {
            operators[1] -= 1;
            backtracking(size+1, sum - arr[size+1]);
            operators[1] += 1;
        }

        if(operators[2] > 0) {
            operators[2] -= 1;
            backtracking(size+1, sum * arr[size+1]);
            operators[2] += 1;
        }

        if(operators[3] > 0) {
            operators[3] -= 1;
            backtracking(size+1, sum / arr[size+1]);
            operators[3] += 1;
        }

    }
}

