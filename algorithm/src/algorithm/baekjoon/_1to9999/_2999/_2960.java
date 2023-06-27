package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2960 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");

        int n = Integer.parseInt(tmp[0]);
        int k = Integer.parseInt(tmp[1]);

        boolean[] arr = new boolean[n + 1];

        int c = 0;
        for(int i=2; i<=n; i++) {

            for(int j=i; j<=n; j+=i) {
                if(!arr[j]) {
                    arr[j] = true;
                    c += 1;

                    if(c == k) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}
