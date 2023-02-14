package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _15651 {

    static int N;
    static int M;
    static List<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        rec();

        System.out.println(sb);
    }

    private static void rec() {

        for(int i=1; i<=N; i++) {
            list.add(i);

            if(list.size() == M) {
                for(int n : list) {
                    sb.append(n).append(" ");
                }
                sb.append(i != N ? "\n" : "");

                list.remove(list.size()-1);
                continue;
            }

            rec();
            list.remove(list.size() - 1);
            sb.append(i != N ? "\n" : "");

        }


    }
}
