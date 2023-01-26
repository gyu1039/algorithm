package algorithm.programmers.codingtest;

public class FindADecimalNumberFromAKAdicNumber {

    public int solution(int n, int k) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % k);
            n /= k;
        }
        String[] arr = sb.reverse().toString().split("0+");
        outer: for(String s : arr) {

            long a = Long.parseLong(s);
            if(a == 1) {
                continue;
            }

            for(long i=2; i<=(int)Math.sqrt(a); i++) {
                if(a % i == 0) {
                    continue outer;
                }
            }

            answer++;
        }

        return answer;
    }
}
