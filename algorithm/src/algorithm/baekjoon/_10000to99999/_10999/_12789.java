package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class _12789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        br.close();

        Stack<Integer> stack = new Stack<>();
        int order = 1;

        for(int i=0; i<n; i++) {

            stack.push(Integer.parseInt(input[i]));
            while (!stack.isEmpty() && order == stack.peek()) {
                order += 1;
                stack.pop();
            }
        }

        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}
