package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        String[] _1 = s.split("0+");
        String[] _0 = s.split("1+");

        int a = 0;
        for(String st : _1) {
            if(!st.equals("")) {
                a += 1;
            }
        }

        int b = 0;
        for(String st : _0) {
            if(!st.equals("")) {
                b += 1;
            }
        }


        System.out.println(Math.min(a, b));
    }
}
