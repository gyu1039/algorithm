package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _21736 {

    static int n, m, ans;
    static char[][] ar;
    static boolean[][] go;
    static int[] nrs = {-1, 0, 1, 0};
    static int[] ncs = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ar = new char[n][m];
        int sr = 0;
        int sc = 0;
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                ar[i][j] = s.charAt(j);
                if (s.charAt(j) == 'I') {
                    sr = i;
                    sc = j;
                }
            }
        }
        br.close();

        go = new boolean[n][m];
        go[sr][sc] = true;
        dfs(sr, sc);

        System.out.println(ans == 0 ? "TT" : ans);
    }

    static void dfs(int row, int col) {

        for(int i=0; i<4; i++){
            int nr = row + nrs[i];
            int nc = col + ncs[i];

            if(0 <= nr && nr < n
                && 0 <= nc && nc < m
                && !go[nr][nc] && ar[nr][nc] != 'X') {

                go[nr][nc] = true;
                ans += ar[nr][nc] == 'P' ? 1 : 0;
                dfs(nr, nc);
            }
        }

    }

}
