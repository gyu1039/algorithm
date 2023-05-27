package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2529 {

    static String[] sign;
    static StringBuilder sb;
    static int k;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        sign = new String[k];
        for(int i=0; i<k; i++) {
            sign[i] = st.nextToken();
        }
        br.close();

        sb = new StringBuilder();
        findMax(new boolean[10], 0, new ArrayList<>());
//        findMin(new boolean[10], 0, new ArrayList<>());

        System.out.println(sb);
    }

    static void findMax(boolean[] impossible, int idx, List<Integer> list) {

        if(list.size() == k+1) {
            for(int n : list) {

                sb.append(n);
            }
            sb.append("\n");
            return;
        }

        if (sign[idx].equals(">")) {


        } else {



        }

    }

    static void findMin(int[] number, int i, List<Integer> list) {

    }
}
