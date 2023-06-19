package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1339 {

    static class Order {

        char c;
        int order;
        int count;

        public Order(char c, int order, int count) {
            this.c = c;
            this.order = order;
            this.count = count;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Character, Order> table = new HashMap<>();
        String[] words = new String[n];
        for(int i=0; i<n; i++) {
            words[i] = br.readLine();
            int len = words[i].length();

            for(int j=0; j<len; j++) {
                char c = words[i].charAt(j);

                if(!table.containsKey(c)) {
//                    System.out.println(c +", " + (j+1));
                    table.put(c, new Order(c, len-j, 1));
                    continue;
                }

                Order cur = table.get(c);
                cur.count += 1;
                cur.order = Math.max(cur.order, len-j);
            }
        }
        br.close();

        List<Order> values = new ArrayList<>(table.values());
        Collections.sort(values, (c1, c2) -> c1.order != c2.order ? Integer.compare(c2.order, c1.order)
                : Integer.compare(c2.count, c1.count));

        int num = 9;
        values.stream().forEach(v -> System.out.println(v.c + ", " + v.order + ", " + v.count));
        for(Order cur : values) {
            for(int i=0; i<n; i++) {
                String s = words[i];
                words[i] = s.replace(cur.c, Character.forDigit(num, 10));
                System.out.println(words[i]);
            }
            n -= 1;
        }

        int answer = 0;
        for(String s : words) {
            answer += Integer.parseInt(s);
        }

        System.out.println(answer);

    }
}
