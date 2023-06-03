package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _17626 {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        br.close();

        int n = 11339;
        int[] dp = new int[n + 1];

        List<Integer>[] list = new ArrayList[n + 1];

        for(int i=1; i<=n; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i=1; i<=n; i++) {
            if(Math.sqrt(i) % 1 == 0){
                list[i].add(i);
                dp[i] = 1;
                continue;
            }

            int min = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++) {

                int tmp = i - j*j;
                if(min > dp[tmp]) {
                    list[i].clear();

                    for(int t : list[tmp]) {
                        list[i].add(t);
                    }
                    list[i].add(j * j);

                    min = dp[tmp];
                }
            }

            dp[i] = min + 1;
        }

        System.out.println(n);
        System.out.println(list[n].size());
        for(int t : list[n]) {
            System.out.println(t);
        }


    }

}
