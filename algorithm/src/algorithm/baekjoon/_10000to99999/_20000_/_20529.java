package algorithm.baekjoon._10000to99999._20000_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _20529 {

    static List<String> list;
    static boolean[] isUsed;
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            int count = 0;
            String string = "";
            for(int i=0; i<n; i++) {

                String s = st.nextToken();
                map.put(s, map.getOrDefault(s, 0) + 1);

                count = Math.max(count, map.get(s));
            }

            if(count >= 3) {
                sb.append("0\n");
                continue;
            }

            list = new ArrayList<>();
            for (String key : map.keySet()) {
                for(int i=0; i<map.get(key); i++) {
                    list.add(key);
                }
            }
            isUsed = new boolean[list.size()];
            for(int i=0; i<isUsed.length; i++) {
                if(!isUsed[i]) {
                    isUsed[i] = true;
                    List<String> param = new ArrayList<>();
                    param.add(list.get(i));
                    rec(i, param);
                    param.remove(param.size()-1);
                    isUsed[i] = false;
                }
            }
            sb.append(ans).append("\n");
            ans = Integer.MAX_VALUE;
        }
        br.close();

        System.out.println(sb);

    }

    static void rec(int idx, List<String> param) {

        if(param.size() == 3) {
            int comp = 0;
            for(int i=0; i<2; i++) {
                String s = param.get(i);

                for(int j=i+1; j<3; j++) {
                    String t = param.get(j);

                    for(int k=0; k<4; k++) {
                        if(s.charAt(k) != t.charAt(k)) {
                            comp += 1;
                        }
                    }
                }
            }

            ans = Math.min(ans, comp);
            return;
        }

        for(int i=idx; i<isUsed.length; i++) {

            if (!isUsed[i]) {
                isUsed[i] = true;
                param.add(list.get(i));
                rec(i, param);
                param.remove(param.size() - 1);
                isUsed[i] = false;
            }
        }
    }
}
