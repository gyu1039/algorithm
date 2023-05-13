package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class _18258 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("push")) {
                list.add(Integer.parseInt(st.nextToken()));
            } else if (op.equals("pop")) {

                if (list.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(list.remove(0)).append("\n");
                }
            } else if (op.equals("size")) {
                sb.append(list.size()).append("\n");
            } else if (op.equals("empty")) {
                sb.append(list.size() == 0 ? "1\n" : "0\n");
            } else if (op.equals("front")) {

                sb.append(list.isEmpty() ? "-1\n" : list.get(0) + "\n");
            } else if (op.equals("back")) {
                sb.append(list.isEmpty() ? "-1\n" : list.get(list.size()-1) + "\n");
            }
        }

        System.out.println(sb);

    }
}
