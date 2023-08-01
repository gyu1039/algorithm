package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1049 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int minPricePackage = Integer.MAX_VALUE;
        int minPriceItem = minPricePackage;

        while(m-- > 0) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            minPricePackage = minPricePackage > a ? a : minPricePackage;
            minPriceItem = minPriceItem > b ? b : minPriceItem;
        }
        br.close();

        int answer = 0;

        if (minPricePackage < 6 * minPriceItem) {
            answer = n % 6 == 0
                    ? n / 6 * minPricePackage
                    : Math.min(n / 6 * minPricePackage + n % 6 * minPriceItem, (n / 6 + 1) * minPricePackage);
        } else {
            answer = n * minPriceItem;
        }

        System.out.println(answer);

    }
}
