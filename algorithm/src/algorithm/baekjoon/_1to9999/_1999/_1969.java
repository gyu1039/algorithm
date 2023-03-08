package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1969 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>(N);

        for(int i=0; i<N; i++) {
            list.add(br.readLine());
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0; i<M; i++) {

            E[] arr = new E[4];
            arr[0] = new E('A', 0);
            arr[1] = new E('T', 0);
            arr[2] = new E('G', 0);
            arr[3] = new E('C', 0);

            for(int j=0; j<N; j++) {
                char cur = list.get(j).charAt(i);

                switch(cur){
                    case 'A':
                        arr[0].count++;
                        break;
                    case 'T':
                        arr[1].count++;
                        break;
                    case 'G':
                        arr[2].count++;
                        break;
                    case 'C':
                        arr[3].count++;
                        break;
                }
            }

            Arrays.sort(arr, (e1,e2) -> {
                return e1.count < e2.count ? 1 :
                        e1.count == e2.count ? e1.c > e2.c ? 1 : -1 : -1;
            });

            sb.append(arr[0].c);
            for(int j=1; j<4; j++) {
                count += arr[j].count;
            }
        }

        sb.append("\n");
        sb.append(count);

        System.out.println(sb);
    }


    static class E {

        char c;
        int count;

        public E(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

}
