package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class _17413 {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);

            if (cur == '<') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }

                int endIdx = s.indexOf('>', i);
                sb.append(s.substring(i, endIdx+1));
                i = endIdx;
                continue;
            }

            if (cur == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(cur);
                continue;
            }

            stack.push(cur);

        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}