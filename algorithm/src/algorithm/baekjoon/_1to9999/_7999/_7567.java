package algorithm.baekjoon._1to9999._7999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7567 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bowl = br.readLine();
        br.close();

        int answer = 10;
        char prevBowl = bowl.charAt(0);
        int len = bowl.length();

        for(int i=1; i<len; i++) {
            char curBowl = bowl.charAt(i);

            if(prevBowl == curBowl) {
                answer += 5;
            } else {
                answer += 10;
            }

            prevBowl = curBowl;
        }

        System.out.println(answer);
    }
}
