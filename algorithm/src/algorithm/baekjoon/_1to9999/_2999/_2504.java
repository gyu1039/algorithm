package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Stack;

public class _2504 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        br.close();
        int answer = 0;
        int tmp = 1;

        for(int i=0; i<arr.length; i++) {

            char c = arr[i];
            if(c == '(' || c == '[') {
                stack.add(c);
                tmp *= (c == '(') ? 2 : 3;
                continue;
            }

            if(stack.isEmpty()) {
                answer = 0;
                break;
            }

            char cc = stack.pop();
            if((c == ')' && cc != '(') || (c == ']' && cc != '[')) {
                answer = 0;
                break;
            }

            if(c == ')') {

                if(arr[i-1] == '(') {
                    answer += tmp;
                }
                tmp /= 2;
                
            } else {

                if(arr[i-1] == '[') {
                    answer += tmp;
                }
                tmp /= 3;
            }
        }

        if (!stack.isEmpty()) {
            answer = 0;
        }
        System.out.println(answer);

    }
}
