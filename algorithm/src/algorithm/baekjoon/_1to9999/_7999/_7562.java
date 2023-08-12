package algorithm.baekjoon._1to9999._7999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _7562 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        int[] rows = {-1, -2, -2, -1, 1, 2, 2, 1};
        int[] cols = {-2, -1, 1, 2, 2, 1, -1, -2};

        while(t-- > 0) {
            int l = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int startRow = Integer.parseInt(input[0]);
            int startCol = Integer.parseInt(input[1]);
            input = br.readLine().split(" ");
            int destinationRow = Integer.parseInt(input[0]);
            int destinationCol = Integer.parseInt(input[1]);

            if (startRow == destinationRow && startCol == destinationCol) {
                answer.append("0\n");
                continue;
            }

            boolean[][] isVisited = new boolean[l][l];
            isVisited[startRow][startCol] = true;
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{startRow, startCol, 0});
            while (!q.isEmpty()) {
                int[] tmp = q.poll();
                int curRow = tmp[0];
                int curCol = tmp[1];
                int curCount = tmp[2];

                if (curRow == destinationRow && curCol == destinationCol) {
                    answer.append(curCount).append("\n");
                    break;
                }
                for(int i=0; i<rows.length; i++) {
                    int nextRow = curRow + rows[i];
                    int nextCol = curCol + cols[i];


                    if(0 <= nextRow && nextRow < l
                        && 0 <= nextCol && nextCol < l &&
                        !isVisited[nextRow][nextCol]) {

                        isVisited[nextRow][nextCol] = true;
                        q.add(new int[]{nextRow, nextCol, curCount + 1});
                    }
                }
            }
        }
        br.close();

        System.out.println(answer);

    }
}
