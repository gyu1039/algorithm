package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class _16198 {

    static int answer;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }


        for(int i=1; i<n-1; i++) {

            backtracking(i, 0);
        }

        System.out.println(answer);

    }

    static void backtracking(int idx, int sum) {


        sum += list.get(idx-1) * list.get(idx+1);
        int n = list.remove(idx);

        if(list.size() == 2) {
            answer = Math.max(answer, sum);
            list.add(idx, n);
            return;
        }


        int size = list.size();
        for(int i=1; i<size-1; i++) {
            backtracking(i, sum);
        }
        list.add(idx, n);

    }
}
