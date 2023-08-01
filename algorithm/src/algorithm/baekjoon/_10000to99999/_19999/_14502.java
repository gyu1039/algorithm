package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _14502 {

    static int n,m;
    static int[][] normalMap;
    static int[][] wallMap;
    static List<int[]> viruses;
    static int[] rows = {-1, 0, 1, 0};
    static int[] cols = {0, 1, 0, -1};
    static int answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        normalMap = new int[n][m];
        wallMap = new int[n][m];
        viruses = new ArrayList<>();

        for(int i=0; i<n; i++) {
            input = br.readLine().split(" ");
            for(int j=0; j<m; j++) {
                int num = Integer.parseInt(input[j]);
                normalMap[i][j] = num;
                if(num == 2) {
                    viruses.add(new int[]{i, j});
                }
            }
        }
        br.close();

        makeWallAndFindAnswer(0, 0);
        System.out.println(answer);
    }

    static void makeWallAndFindAnswer(int start, int wallCount) {

        if(wallCount == 3) {

            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    wallMap[i][j] = normalMap[i][j];
                }
            }

            for(int[] loc : viruses) {
                spreadVirus(loc[0], loc[1]);
            }

            answer = Math.max(answer, getSafeAreaSize());
            return;
        }

        for(int i=start; i<n*m; i++) {
            int row = i/m;
            int col = i%m;

            if(normalMap[row][col] == 0) {
                normalMap[row][col] = 1;
                makeWallAndFindAnswer(i+1, wallCount + 1);
                normalMap[row][col] = 0;
            }
        }
    }

    static void spreadVirus(int row, int col) {

        for(int i=0; i<cols.length; i++) {

            int nextRow = row + rows[i];
            int nextCol = col + cols[i];

            if (0 <= nextRow && nextRow < n
                    && 0 <= nextCol && nextCol < m
                    && wallMap[nextRow][nextCol] == 0) {

                wallMap[nextRow][nextCol] = 2;
                spreadVirus(nextRow, nextCol);
            }
        }
    }

    static int getSafeAreaSize() {

        int size = 0;
        for(int i=0; i<n; i++) {

            for(int j=0; j<m; j++) {
                if(wallMap[i][j] == 0) {
                    size += 1;
                }
            }
        }

        return size;
    }
}
