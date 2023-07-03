package algorithm.baekjoon._1to9999._4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4659 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String IS = "is acceptable.\n";
        final String NOT = "is not acceptable.\n";

        String s;
        StringBuilder answer = new StringBuilder();
        while(!(s = br.readLine()).equals("end")) {

            answer.append("<").append(s).append("> ");

            int countOfVowel = 0;
            char prev = ' ';
            boolean p = true;

            int len = s.length();
            char[] chars = new char[len];
            for(int i=0; i<len; i++) {
                char cur = s.charAt(i);

                if(prev == cur && (prev != 'e' && prev != 'o')) {
                    p = false;
                    break;
                }

                if(cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u') {
                    countOfVowel += 1;
                    chars[i] = 'O';
                } else {
                    chars[i] = 'X';
                }


                if(i > 1 && (chars[i-2] == chars[i-1] && chars[i-1] == chars[i])) {
                    p = false;
                    break;
                }

                prev = cur;
            }

            if(countOfVowel == 0) {
                p = false;
            }

            answer.append(!p ? NOT : IS);
        }

        System.out.println(answer);
    }
}
