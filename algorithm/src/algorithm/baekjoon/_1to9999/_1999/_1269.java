package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _1269 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeA = Integer.parseInt(st.nextToken());
        int sizeB = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>(sizeA);
        Set<Integer> B = new HashSet<>(sizeB);

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        int result = 0;

        for(int e : B) {
            if(!A.contains(e)) {
                result++;
            }
        }

        for(int e : A) {
            if(!B.contains(e)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
