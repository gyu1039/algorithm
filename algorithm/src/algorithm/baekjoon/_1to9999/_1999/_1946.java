package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1946 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            E[] ar = new E[N];
            for(int i=0; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                ar[i] = new E(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            Arrays.sort(ar);

            int count = 0;
            outer: for(int i=0; i<N; i++) {
                E cur = ar[i];
                for(int j=0; j<i; j++) {
                    E vs = ar[j];
                    if(cur.interviewTestResult > vs.interviewTestResult) {
                        continue outer;
                    }
                }
                count++;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }


    static class E implements Comparable<E> {

        int documentScreeningResult;
        int interviewTestResult;

        E(int documentScreeningResult, int interviewTestResult) {
            this.documentScreeningResult = documentScreeningResult;
            this.interviewTestResult = interviewTestResult;
        }

        @Override
        public int compareTo(E o) {
            return this.documentScreeningResult > o.documentScreeningResult ? 1 : -1;
        }
    }
}
