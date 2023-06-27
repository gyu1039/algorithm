package algorithm.baekjoon._1to9999._5999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _5397 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        while(t-- > 0) {

            for (char p : br.readLine().toCharArray()) {

                if(p == '<' ) {
                    if(!left.isEmpty())
                        right.push(left.pop());

                } else if(p == '>') {
                    if(!right.isEmpty())
                        left.push(right.pop());

                } else if(p == '-') {
                    if(!left.isEmpty())
                        left.pop();

                } else {
                    left.push(p);
                }
            }


            StringBuilder tmp = new StringBuilder();
            while (!left.isEmpty()) {
                tmp.append(left.pop());
            }
            answer.append(tmp.reverse());

            while (!right.isEmpty()) {
                answer.append(right.pop());
            }

            answer.append("\n");
        }
        br.close();

        System.out.println(answer);
    }
}
