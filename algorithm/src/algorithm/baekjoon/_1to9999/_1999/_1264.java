package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1264 {

    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String s;
            StringBuilder sb = new StringBuilder();
            while (!(s = br.readLine()).equals("#")) {

                int len = s.length();
                int count = 0;

                for(int i=0; i<len; i++) {

                    char c = s.charAt(i);

                    if(c == 'a' || c == 'A'
                            || c == 'e' || c == 'E'
                            || c == 'i' || c == 'I'
                            || c == 'o' || c == 'O'
                            || c == 'u' || c == 'U') {

                        count += 1;
                    }
                }
                sb.append(count).append("\n");
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
