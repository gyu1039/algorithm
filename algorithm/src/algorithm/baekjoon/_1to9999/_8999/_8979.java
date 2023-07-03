package algorithm.baekjoon._1to9999._8999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _8979 {

    static class Nation {

        int k;
        int gold, silver, bronze;

        public Nation(int k, int gold, int silver, int bronze) {
            this.k = k;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        Nation[] nations = new Nation[n];
        for(int i=0; i<n; i++) {
            input = br.readLine().split(" ");
            nations[i] = new Nation(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3]));
        }

        Arrays.sort(nations, (n1, n2) -> n1.gold != n2.gold ? Integer.compare(n2.gold, n1.gold) :
                n1.silver != n2.silver ? Integer.compare(n2.silver, n1.silver) :
                        Integer.compare(n2.bronze, n1.bronze));

        int rank = 1;
        for(int i=0; i<n-1; i++) {

            if(nations[i].k == k) {
                break;
            }

            if (!(nations[i].gold == nations[i + 1].gold
                    && nations[i].silver == nations[i + 1].silver
                    && nations[i].bronze == nations[i + 1].bronze)) {

                rank = i+2;
            }
        }

        System.out.println(rank);
        br.close();

    }
}
