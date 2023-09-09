package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1759 {

    static int L, C;
    static char[] arr;
    static StringBuilder answer = new StringBuilder();
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        L = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);

        char[] chars = br.readLine().toCharArray();
        br.close();

        arr = new char[C];
        for(int i=0; i<chars.length; i+=2) {
            arr[i/2] = chars[i];
        }

        Arrays.sort(arr);

        isVisited = new boolean[C];
        backtracking(0, 0);

        System.out.println(answer);
    }

    static void backtracking(int count, int curIdx) {

        if(count == L) {

            int numberOfVowels = 0;
            int numberOfConsonants = 0;

            for(int i=0; i<C; i++) {

                if(!isVisited[i]) {
                    continue;
                }

                char c = arr[i];
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    numberOfVowels += 1;
                } else {
                    numberOfConsonants += 1;
                }
            }

            if(numberOfVowels > 0 && numberOfConsonants > 1) {

                for(int i=0; i<C; i++) {
                    if(isVisited[i]) {
                        answer.append(arr[i]);
                    }
                }
                answer.append("\n");
            }

            return;
        }

        for(int i=curIdx; i<C; i++) {

            if(!isVisited[i]) {

                isVisited[i] = true;
                backtracking(count + 1, i+1);
                isVisited[i] = false;

            }
        }
    }
}
