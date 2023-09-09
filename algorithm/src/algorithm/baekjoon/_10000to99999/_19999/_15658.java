package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _15658 {


    static class Point {


        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    static int answer = Integer.MAX_VALUE;
    static List<Point> person;
    static List<Point> chicken;
    static int[][] map;
    static int N, M;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        N = Integer.parseInt(arr[0]);
        M = Integer.parseInt(arr[1]);

        map = new int[N][N];
        person = new ArrayList<>();
        chicken = new ArrayList<>();


        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");

            for(int j=0; j<N; j++) {

                map[i][j] = Integer.parseInt(input[j]);

                if(map[i][j] == 1) {
                    person.add(new Point(i, j));
                } else if(map[i][j] == 2) {
                    chicken.add(new Point(i, j));
                }
            }
        }
        br.close();

        isVisited = new boolean[chicken.size()];

        backtracking(0, 0);

        System.out.println(answer);
    }

    static void backtracking(int start, int count) {

        if (count == M) {

            int res = 0;
            for(int i=0; i<person.size(); i++) {

                int tmp = Integer.MAX_VALUE;

                for(int j=0; j<chicken.size(); j++) {
                    if (isVisited[j]) {
                        int distance = Math.abs(person.get(i).x - chicken.get(j).x) +
                                Math.abs(person.get(i).y - chicken.get(j).y);

                        tmp = Math.min(tmp, distance);
                    }
                }

                res += tmp;
            }

            answer = Math.min(answer, res);
            return;
        }

        for(int i=start; i<chicken.size(); i++) {
            isVisited[i] = true;
            backtracking(i+1, count + 1);
            isVisited[i] = false;
        }

    }

}
