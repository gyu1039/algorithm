package algorithm.baekjoon._1to9999._9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9935 {

    public static void main(String[] args) throws IOException {


        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] normal = br.readLine().toCharArray();
        char[] bomb = br.readLine().toCharArray();
        br.close();

        // 풀이 과정

        char[] answer = new char[normal.length];
        int idx = 0;
        for (int i = 0; i < normal.length; i++) {

            answer[idx] = normal[i];

            if(answer[idx] == bomb[bomb.length-1] && idx >= bomb.length-1) {

                int tmpIdx = idx - bomb.length + 1;
                boolean flag = true;

                for(int j=0; j < bomb.length; j++) {
                    if(answer[tmpIdx] != bomb[j]) {
                        flag = false;
                        break;
                    }
                    tmpIdx += 1;
                }

                if(flag) {
                    idx -= bomb.length;
                }
            }

            idx += 1;
        }

        String ans = "FRULA";
        if(idx > 0) {
            ans = String.valueOf(answer, 0, idx);
        }
        System.out.println(ans);
    }


}
