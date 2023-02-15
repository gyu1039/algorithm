package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10817 {

    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        arr = new int[3];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quicksort(0, arr.length-1);

        System.out.println(arr[arr.length / 2]);
    }

    private static void quicksort(int start, int end) {

        if(start < end) {
            int pivot = partition(start, end);
            quicksort(start, pivot - 1);
            quicksort(pivot + 1, end);
        }

    }

    private static int partition(int start, int end) {

        int pivot = arr[end];
        int i = start - 1;

        for(int j=start; j<end; j++) {

            if(arr[j] <= pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = pivot;
        arr[end] = arr[i+1];
        arr[i+1] = tmp;

        return i + 1;
    }

}
