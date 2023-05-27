package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _14889 {

    static int n;
    static int answer = Integer.MAX_VALUE;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        for(int i=1; i<=n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        rec(list, 2);

        System.out.println(answer);

    }

    static void rec(List<Integer> list, int idx) {

        if(list.size() == n/2) {

            int sum = 0;
            int len = list.size();

            for(int i=0; i<len; i++) {
                for(int j=0; j<len; j++) {
                    if(i == j) continue;
                    sum += arr[list.get(i)][list.get(j)];

                }
            }

            int otherSum = 0;
            int[] other = new int[n/2];
            int ix = 0;
            for(int i=1; i<=n; i++) {
                if(!list.contains(i)){
                    other[ix] = i;
                    ix += 1;
                }
            }
            for(int i=0; i<other.length; i++) {

                for(int j=0; j<other.length; j++) {
                    if(i == j) continue;
                    otherSum += arr[other[i]][other[j]];
                }
            }

            answer = Math.min(answer, Math.abs(sum - otherSum));

            return;
        }

        for(int i=idx; i<=n; i++) {

            if (!list.contains(i)) {
                list.add(i);
                rec(list, i);
                list.remove(list.size() - 1);
            }
        }
    }
}
