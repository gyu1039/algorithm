package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1244 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfSwitch = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");
        int[] state = new int[numOfSwitch+1];
        for(int i=0; i<tmp.length; i++) {
            state[i+1] = Integer.parseInt(tmp[i]);
        }
        int numOfStudent = Integer.parseInt(br.readLine());
        String[] students = new String[numOfStudent];
        for(int i=0; i<numOfStudent; i++) {
            students[i] = br.readLine();
        }
        br.close();

        for (String student : students) {
            tmp = student.split(" ");
            int sex = Integer.parseInt(tmp[0]);
            int num = Integer.parseInt(tmp[1]);

            if(sex == 1) {

                for(int i=1; i<=numOfSwitch/num; i++) {
                    state[num*i] = state[num*i] == 1 ? 0 : 1;
                }
            } else {
                int left = num-1;
                int right = num+1;

                while(left >= 1 && right <state.length) {


                    if(state[left] != state[right]) {
                        break;
                    }
                    left -= 1;
                    right += 1;
                }

                for(int i=left+1; i<right; i++) {
                    state[i] = state[i] == 1 ? 0 : 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<state.length; i++) {
            sb.append(state[i]).append(" ");

            if(i % 20 == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
