package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1213 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        br.close();

        Arrays.sort(input);
        char[] answer = new char[input.length];
        int left = 0, right = answer.length-1;
        int num = 0;
        for(int i=0; i<input.length; i++) {
            char c = input[i];
            int count = 1;
            for(int j=i+1; j<input.length; j++) {
                if(c != input[j]){
                    i = j - 1;
                    break;
                }

                if(j == input.length - 1) {
                    i = j;
                }
                count += 1;
            }

            if(count % 2 != 0) {
                num += 1;
                answer[input.length/2] = c;

                for(int j=0; j<(count-1)/2; j++) {
                    answer[left++] = c;
                    answer[right--] = c;
                }

            } else {

                for(int j=0; j<count/2; j++){
                    answer[left++] = c;
                    answer[right--] = c;
                }
            }

            if(num > 1) {
                System.out.println("I\'m Sorry Hansoo");
                break;
            }

        }

        if(num < 2) {
            System.out.println(answer);
        }

    }
}
