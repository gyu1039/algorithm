package algorithm.baekjoon._1to9999._4999;

import java.util.Arrays;

public class _4673 {

    public static void main(String[] args) {

        boolean[] isSelfNumber = new boolean[10000 + 1];
        Arrays.fill(isSelfNumber, true);


        for(int i=1; i<isSelfNumber.length; i++) {

            int n = i;
            if(isSelfNumber[i]) {

                while(n < isSelfNumber.length) {
                    int tmp = n;

                    while(tmp > 0) {
                        n += tmp % 10;
                        tmp /= 10;
                    }

                    if(n >= isSelfNumber.length) {
                        break;
                    }
                    isSelfNumber[n] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i< isSelfNumber.length - 1; i++) {
            if (isSelfNumber[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
