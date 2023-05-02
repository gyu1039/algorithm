package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _11478 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int len = S.length();
        int digit = 1;

        Set<String> set = new HashSet<>();
        for(int i=0; i<len; i++) {
            int tmp = digit;
            for(int j=0; j<len-i; j++) {
                set.add(S.substring(j, tmp));
                tmp++;
            }
            digit +=1;
        }

        System.out.println(set.size());
    }
}
