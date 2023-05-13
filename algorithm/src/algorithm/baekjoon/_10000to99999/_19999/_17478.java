package algorithm.baekjoon._10000to99999._19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17478 {

    static String[] ar;
    static int n;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();

        ar = new String[] {"\"재귀함수가 뭔가요?\"\n"
                , "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n"
                , "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n"
                , "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n"
                , "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n"
                , "라고 답변하였지.\n"};

        sb = new StringBuilder();
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        rec(0);
        System.out.println(sb);
    }

    public static void rec(int count) {


        String tmp = "_".repeat(4 * count);
        sb.append(tmp).append(ar[0]);
        if(count == n) {
            sb.append(tmp).append(ar[4])
                    .append(tmp).append(ar[5]);
            return;
        }
        sb.append(tmp).append(ar[1])
                .append(tmp).append(ar[2])
                .append(tmp).append(ar[3]);

        rec(count + 1);
        sb.append(tmp).append(ar[5]);
    }
}
