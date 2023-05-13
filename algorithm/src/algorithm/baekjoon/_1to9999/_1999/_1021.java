package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1021 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> d = new LinkedList<>();
        for(int i=1; i<=N; i++) {
            d.add(i);
        }

        List<Integer> ls = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            ls.add(Integer.parseInt(st.nextToken()));
        }
        br.close();

        int result = 0;
        for(int i=0; i<M; i++) {

            int n = ls.get(i);
            if(n == d.get(0)) {

            } else if(d.indexOf(n) < d.size() / 2 + 1) {

                while(d.get(0) != n) {
                    d.add(d.remove(0));
                    result++;
                }

            } else {
                while(d.get(0) != n) {

                    d.add(0, d.remove(d.size()-1));
                    result++;
                }
            }

            d.remove(0);
        }

        System.out.println(result);
    }
}
