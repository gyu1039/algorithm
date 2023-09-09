package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1543 {

    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String doc = br.readLine();
            String word = br.readLine();

            int docLen = doc.length();
            int wordLen = word.length();

            int answer = 0;

            for(int i=0; i <= docLen - wordLen; i++) {

                int count = 0;
                for(int j=0; j<wordLen; j++) {

                    if(doc.charAt(j+i) == word.charAt(j)) {
                        count += 1;
                    }
                }

                if(count == wordLen) {
                    i += wordLen - 1;
                    answer += 1;
                }

            }

            System.out.println(answer);

        } catch (IOException e) {

        }

    }
}
