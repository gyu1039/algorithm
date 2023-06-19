package algorithm.baekjoon._1to9999._2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2493 {

    static class Top {
        int height;
        int idx;
        int higherThanMe;

        public Top(int height, int idx, int higherThanMe) {
            this.height = height;
            this.idx = idx;
            this.higherThanMe = higherThanMe;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");
        Top[] tops = new Top[n];
        for(int i=0; i<n; i++) {
            int curHeight = Integer.parseInt(tmp[i]);
            int higherIdx = 0;
            for(int j=i-1; j>=0; j--) {
                if(tops[j].height > curHeight) {
                    higherIdx = tops[j].idx + 1;
                    break;
                } else if(j > 1){
                    j = tops[j].higherThanMe;
                }
            }
            tops[i] = new Top(curHeight, i, higherIdx);
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for(Top r : tops) {
            sb.append(r.higherThanMe).append(" ");
        }
        System.out.println(sb);
    }
}
