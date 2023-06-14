package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13305 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        long[] distances = new long[N-1];
        long[] pricePerLiter = new long[N];
        for(int i=0; i<distances.length; i++) {
            distances[i] = Long.parseLong(st.nextToken());
            pricePerLiter[i] = Long.parseLong(st2.nextToken());
        }
        br.close();

        long answer = distances[0] * pricePerLiter[0];
        long cost = pricePerLiter[0];

        for(int i=1; i<distances.length; i++) {

            if (cost > pricePerLiter[i]) {
                cost = pricePerLiter[i];
            }

            answer += cost * distances[i];
        }

        System.out.println(answer);
    }
}
