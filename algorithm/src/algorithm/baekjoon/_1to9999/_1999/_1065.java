package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1065 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=1; i<=N; i++) {

            if(hansoo(i)) {

                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean hansoo(int n) {

       if(n <= 99) {
           return true;
       }

       int d = n % 10;
       n /= 10;
       d = d - (n % 10);

       while(n != 0) {
           int d1 = n % 10;
           n /= 10;
           d1 = d1 - (n % 10);

           if(d != d1) {
               return false;
           }
           n /= 10;
       }

        return true;
    }

}
