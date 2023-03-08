package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _11728 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] B = new int[M];
        for(int i=0; i<M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(A);
        Arrays.sort(B);

        StringBuilder result = new StringBuilder();
        int iA = 0;
        int iB = 0;
        for(int i=0; i<N+M; i++) {

            if(iA == N) {
                result.append(B[iB++]).append(" ");
            } else if(iB == M) {
                result.append(A[iA++]).append(" ");
            } else if(A[iA] > B[iB]) {
                result.append(B[iB++]).append(" ");
            } else {
                result.append(A[iA++]).append(" ");
            }
        }

        System.out.println(result);
    }
}
