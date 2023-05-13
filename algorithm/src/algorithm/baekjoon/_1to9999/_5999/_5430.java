package algorithm.baekjoon._1to9999._5999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _5430 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        outer: while(T-- > 0) {
            char[] op = br.readLine().toCharArray();

            br.readLine();

            String s = br.readLine();
            s = s.substring(1, s.length() - 1);
            StringTokenizer st = new StringTokenizer(s, ",");
            Deque<Integer> d = new LinkedList<>();
            while(st.hasMoreTokens()) {
                d.add(Integer.parseInt(st.nextToken()));
            }
            boolean isFirst = true;

            for(char o : op) {

                if(o == 'R') {
                    isFirst = !isFirst;
                } else if(d.size() == 0) {
                    sb.append("error\n");
                    continue outer;

                } else if (isFirst) {
                    d.pollFirst();
                } else {
                    d.pollLast();
                }

            }

            sb.append('[');

            boolean isZero = d.size() == 0;
            if(isFirst) {
                while(!d.isEmpty()) {
                    sb.append(d.pollFirst()).append(',');
                }
            } else {
                while(!d.isEmpty()) {
                    sb.append(d.pollLast()).append(',');
                }
            }
            if(!isZero) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("]\n");
        }

        System.out.println(sb);
    }
}
