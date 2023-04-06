package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _25206 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sumOfCredits = 0;
        double mul = 0;
        for(int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("P")) {
                continue;
            }

            mul += cal(grade) * credit;
            sumOfCredits += credit;
        }

        System.out.println(mul / sumOfCredits);
    }

    private static double cal(String nextToken) {

        switch (nextToken) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0;
        }

        return 0;
    }
}
