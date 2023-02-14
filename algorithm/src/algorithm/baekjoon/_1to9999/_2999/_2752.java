package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2752 {

    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        arr = new int[3];

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, arr.length-1);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }

    private static void mergeSort(int start, int end) {

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }

    }

    private static void merge(int start, int mid, int end) {

        int p = start, q = mid + 1, i = 0;
        int[] tmp = new int[end - start + 1];

        while(p <= mid && q <= end) {
            if(arr[p] < arr[q]) {
                tmp[i++] = arr[p++];
            } else {
                tmp[i++] = arr[q++];
            }
        }

        while(p <= mid) {
            tmp[i++] = arr[p++];
        }
        while(q <= end) {
            tmp[i++] = arr[q++];
        }

        for(int j=0; j<tmp.length; j++) {
            arr[j] = tmp[j];
        }
    }
}
