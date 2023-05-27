package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _15686 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] ar = new int[N][N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        List<int[]> chickenRestaurant = new ArrayList<>();
        List<int[]> houses = new ArrayList<>();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {

                if(ar[i][j] == 1) {
                    houses.add(new int[]{i, j});

                } else if(ar[i][j] == 2) {
                    chickenRestaurant.add(new int[]{i, j});
                }
            }
        }

        int size = chickenRestaurant.size();
        boolean[] isVisited = new boolean[size];

        Queue<int[]> selected = new LinkedList<>();
        for(int i=0; i<size; i++) {

            if(!isVisited[i]) {
                isVisited[i] = true;
                selected.add(chickenRestaurant.get(i));
                selecting(1);
                isVisited[i] = false;
                selected.poll();
            }
        }
        
    }

    static void selecting(int count) {

    }
}
