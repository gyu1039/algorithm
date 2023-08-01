package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _10819 {

    static int answer;
    static int n;
    static int[] arr;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        br.close();
        arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        isVisited = new boolean[n];

        backtracking(new ArrayList<>());

        System.out.println(answer);
    }

    static void backtracking(List<Integer> list) {

        if(list.size() == n) {
            int sum = 0;

            for(int i=0; i<n-1; i++) {
                sum += Math.abs(list.get(i) - list.get(i + 1));
            }

            answer = Math.max(answer, sum);
            return;
        }

        for(int i=0; i<n; i++) {
            if (!isVisited[i]) {
                list.add(arr[i]);
                isVisited[i] = true;
                backtracking(list);
                isVisited[i] = false;
                list.remove(list.size()-1);
            }
        }

    }

}
