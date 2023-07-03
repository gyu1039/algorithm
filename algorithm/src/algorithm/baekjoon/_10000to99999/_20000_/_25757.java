package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _25757 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String game = input[1];

        int answer = 0;

        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(br.readLine());
        }
        br.close();

        if (game.equals("Y")) {
            answer = set.size();
        } else if (game.equals("F")) {
            answer = set.size() / 2;
        } else {
            answer = set.size() / 3;
        }

        System.out.println(answer);
    }
}
