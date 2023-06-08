package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _10026 {

    static int n;
    static char[][] ar;
    static boolean[][] isVisited;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ar = new char[n][n];
        isVisited = new boolean[n][n];
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<n; j++) {
                ar[i][j] = s.charAt(j);
            }
        }

        int countA = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if (!isVisited[i][j]) {
                    isVisited[i][j] = true;
                    HashSet<Character> set = new HashSet<>();
                    set.add(ar[i][j]);
                    bfs(i, j, set);
                    countA += 1;
                }
            }
        }

        isVisited = new boolean[n][n];
        int countB = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if (!isVisited[i][j]) {
                    isVisited[i][j] = true;
                    HashSet<Character> set = new HashSet<>();
                    if(ar[i][j] == 'B') {
                        set.add('B');
                    } else {
                        set.add('R');
                        set.add('G');
                    }
                    bfs(i, j, set);
                    countB += 1;
                }
            }
        }

        System.out.println(String.format("%d %d", countA, countB));
    }


    static void bfs(int row, int col, Set<Character> set) {

        for(int i=0; i<4; i++) {
            int a = row + dy[i];
            int b = col + dx[i];

            if (0 <= a && a < n
                    && 0 <= b && b < n
                    && !isVisited[a][b]
                    && set.contains(ar[a][b])) {

                isVisited[a][b] = true;
                bfs(a, b, set);
            }
        }
    }

}
