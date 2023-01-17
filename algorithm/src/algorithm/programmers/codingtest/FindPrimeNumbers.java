package algorithm.programmers.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindPrimeNumbers {

    public int solution(int n) {
        int answer = 0;

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        int sq = (int) Math.sqrt(n);
        for (int i = 2; i <= sq; i++) {

            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {

            if (isPrime[i]) {
                answer++;
            }
        }
        return answer;
    }

    public void way2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        int[] arr = new int[testCase];


        for(int i=0; i<testCase; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<testCase; i++) {

            if(arr[i] == 2) {
                sb.append("Prime\n");

            } else if(arr[i] == 1 || arr[i] % 2 == 0) {
                sb.append("Not prime\n");
            } else {

                int sqrt = (int)Math.sqrt(arr[i]);

                boolean isPrime = true;
                for(int j=2; j<=sqrt && isPrime; j++) {

                    if(arr[i] % j == 0) {
                        isPrime = false;
                    }

                }

                sb.append(isPrime ? "Prime\n" : "Not prime\n");
            }
        }

        System.out.println(sb);
    }
}
