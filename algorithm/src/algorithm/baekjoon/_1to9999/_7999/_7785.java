package algorithm.baekjoon._1to9999._7999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class _7785{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        TreeSet table = new TreeSet<String>();
        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(table.contains(name)) {
                table.remove(name);
            } else {
                table.add(name);
            }
        }

        StringBuilder sb = new StringBuilder();
        table.descendingIterator().forEachRemaining(s -> sb.append(s).append("\n"));

        System.out.println(sb);
    }
}
