package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1780 {

    static int[][] ar;
    static int[] result;
    static Queue<int[]> q;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ar = new int[N][N];
        q = new LinkedList<>();
        result = new int[3];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        q.add(new int[]{0, 0, N});
        while (!q.isEmpty()) {
            int[] a = q.poll();
            solving(a);
        }

        for(int n : result) {
            System.out.println(n);
        }

    }

    private static void solving(int[] a) {

        int value = ar[a[0]][a[1]];
        int row = a[0] + a[2];
        int col = a[1] + a[2];

        for(int i=a[0]; i<row; i++) {

            for(int j=a[1]; j<col; j++) {

                if(ar[i][j] == value) {
                    continue;
                }

                int addNum = a[2] / 3;
                for(int k1=a[0]; k1<row; k1 += addNum) {
                    for(int k2=a[1]; k2<col; k2 += addNum) {

                        q.add(new int[] {k1, k2, a[2]/3});
//                        System.out.printf("k1: %d, k2: %d, n: %d\n", k1, k2, a[2]%3);
                    }
                }
                return;
            }
        }

        result[ar[a[0]][a[1]] + 1]++;
    }
}
