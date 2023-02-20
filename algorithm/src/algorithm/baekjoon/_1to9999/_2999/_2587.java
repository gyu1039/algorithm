package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _2587 {

    static int[] ints;

    static final int SIZE = 5;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ints = new int[SIZE + 1];

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i=1; i<=SIZE;i++) {
            ints[i] = Integer.parseInt(br.readLine());
            sum += ints[i];
        }
        br.close();

        sb.append(sum/SIZE).append("\n");

        for(int i=SIZE/2; i>0; i--) {
            heapfify(i, SIZE);
        }

        quicksort();
        sb.append(ints[SIZE/2 + 1]);
        System.out.println(sb);
    }

    private static void heapfify(int i, int len) {

        if (i*2 > len) {
            return;
        }

        if(i*2 + 1 > len) {

            if(ints[i] < ints[2*i]) {
                int tmp = ints[i];
                ints[i] = ints[2*i];
                ints[2*i] = tmp;
            }

            return;
        }

        if(ints[2*i] > ints[2*i+1] && ints[i] < ints[2*i]) {
            swap(2*i, i);
            heapfify(2*i, len);
        } else if(ints[2*i + 1] >= ints[2*i] && ints[i] < ints[2*i + 1]) {
            swap(2*i+1, i);
            heapfify(2*i + 1, len);
        }

    }

    private static void swap(int i1, int i2) {

        int tmp = ints[i1];
        ints[i1] = ints[i2];
        ints[i2] = tmp;
    }

    private static void quicksort() {


        for(int i=SIZE; i>1; i--) {

            int tmp = ints[i];
            ints[i] = ints[1];
            ints[1] = tmp;

            heapfify(1, i-1);
        }


    }
}
