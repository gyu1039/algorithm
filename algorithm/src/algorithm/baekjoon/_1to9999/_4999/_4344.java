package algorithm.baekjoon._1to9999._4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        while(t-- > 0) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int[] students = new int[n];
            double sum = 0;
            for(int i=1; i<=n; i++) {
                students[i-1] = Integer.parseInt(input[i]);
                sum += students[i-1];
            }
            double avg = sum / n;
            int count = 0;
            for(int i=0; i<students.length; i++) {
                if(students[i] > avg) {
                    count += 1;
                }
            }

            String result = String.format("%.3f", Math.round((double) count / n * 100 * 1000) / 1000.0);
            answer.append(result).append("%\n");
        }
        br.close();
        System.out.println(answer);
    }
}
