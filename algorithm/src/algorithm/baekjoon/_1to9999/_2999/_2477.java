package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2477 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        int[] arr = new int[6];
        for(int i=0; i<6; i++) {
            arr[i] = Integer.parseInt(br.readLine().split(" ")[1]);
        }
        br.close();

        int wVal, hVal, xIdx, yIdx, xVal, yVal;
        wVal = hVal = 0;
        xIdx = yIdx = -1;

        for(int i=0; i<arr.length; i+=2) {

            int l = arr[i];
            if(hVal < l) {
                hVal = l;
                xIdx = i;
            }

            l = arr[i+1];
            if(wVal < l) {
                wVal = l;
                yIdx = i+1;
            }
        }

        xVal = arr[(xIdx + 3) % arr.length];
        yVal = arr[(yIdx + 3) % arr.length];

        System.out.println(k * (wVal*hVal - xVal*yVal));
    }
}
