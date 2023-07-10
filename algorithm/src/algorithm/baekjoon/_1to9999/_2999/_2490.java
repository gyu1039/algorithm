package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class _2490 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder answer = new StringBuilder();
        for(int i=0; i<3; i++) {
            String[] input = br.readLine().split(" ");
            int _0 = 0;
            int _1 = 0;
            for(int j=0; j<input.length; j++) {
                if(input[j].equals("0")) {
                    _0 += 1;
                } else {
                    _1 += 1;
                }
            }

            if(_0 == 4) {
                answer.append("D\n");
            } else if(_0 == 3 && _1 == 1) {
                answer.append("C\n");
            } else if(_0 == 2 && _1 == 2) {
                answer.append("B\n");
            } else if(_0 == 1 && _1 == 3) {
                answer.append("A\n");
            } else {
                answer.append("E\n");
            }
        }

        System.out.println(answer);
    }
}
