package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _24060 {

    static int counting = 0;
    static int result = -1;
    static int K;
    static int[] ar;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ar = new int[N];
        for(int i=0; i<N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        mergeSort(0, N - 1);
        System.out.println(result);
    }

    private static void mergeSort(int p, int r) {
        if(p < r) {
            int mid = p + (r-p)/2;
            mergeSort(p, mid);
            mergeSort(mid+1, r);
            merge(p, mid, r);
        }
    }

    private static void merge(int p, int mid, int r) {

        int i = p;
        int j = mid + 1;
        int t = 0;
        int[] tmp = new int[r-p+1];

        while(i <= mid && j <= r) {

            if(ar[i] <= ar[j]) {
                tmp[t] = ar[i];
                i += 1;
            } else {
                tmp[t] = ar[j];
                j++;
            }
            t += 1;
        }

        while(i <= mid) {
            tmp[t++] = ar[i++];
        }
        while(j <= r) {
            tmp[t++] = ar[j++];
        }
        i = p;
        t = 0;
        while(i <= r) {
            ar[i++] = tmp[t++];
            counting += 1;
            if(counting == K) {
                result = ar[i-1];
            }
        }
    }

}
