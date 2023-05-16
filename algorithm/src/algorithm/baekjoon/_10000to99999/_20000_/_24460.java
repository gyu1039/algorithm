package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _24460 {

    static int[][] ar;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ar = new int[n][n];
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(rec(n, 0, 0));
    }

    public static int rec(int size, int row, int col) {

        if(size == 1) {
            return ar[row][col];
        }

        List<Integer> result = new ArrayList<>();
        result.add(rec(size / 2, row, col));
        result.add(rec(size / 2, row, col + size/2)) ;
        result.add(rec(size / 2, row + size/2, col)) ;
        result.add(rec(size / 2, row + size/2, col + size/2));

        Collections.sort(result);
        return result.get(1);
    }
}
