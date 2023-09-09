package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17609 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        while(testCase-- > 0) {

            char[] arr = br.readLine().toCharArray();

            if (isPalindrome(0, arr.length - 1, arr)) {
                answer.append("0\n");
                continue;
            }

            if (isPseudoPalindrome(0, arr.length - 1, arr)) {
                answer.append("1\n");

            } else {
                answer.append("2\n");
            }
        }
        br.close();

        System.out.println(answer);
    }

    static boolean isPalindrome(int left, int right, char[] arr) {

        while(left < right) {
            if(arr[left] != arr[right]) {
                return false;
            }

            left += 1;
            right -= 1;
        }
        return true;
    }

    static boolean isPseudoPalindrome(int left, int right, char[] arr) {

        while(left < right) {

            if (arr[left] != arr[right]) {
                boolean isP1 = isPalindrome(left + 1, right, arr);
                boolean isP2 = isPalindrome(left, right-1, arr);

                if(!isP1 && !isP2) {
                    return false;
                } else {
                    return true;
                }
            }

            left += 1;
            right -= 1;

        }

        return true;
    }
}
