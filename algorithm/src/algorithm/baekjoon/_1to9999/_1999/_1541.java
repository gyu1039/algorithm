package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class _1541 {

    static List<String> list;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        br.close();

//        String s = "00009-00009";
//        int len = s.length();
        list = new LinkedList<>();
        int start = 0;
        for(int i=0; i<len; i++) {
            char c = s.charAt(i);

            if('0' <= c && c <= '9') {
                continue;
            }

            String num = s.substring(start, i);
            list.add(num);
            start = i+1;
            list.add(String.valueOf(c));

        }
        list.add(s.substring(start, len));

//        list.stream().forEach(System.out::println);

        int idx = 0;
        while(2*idx + 1 < list.size()) {
            if(list.get(2*idx + 1).equals("+")) {
                String a = list.remove(2*idx);
                list.remove(2*idx);
                String b = list.remove(2*idx);

                list.add(2*idx, String.valueOf(Integer.parseInt(a) + Integer.parseInt(b)));
            } else {
                idx += 1;
            }

        }

        idx = 0;
        while(list.size() != 1) {

            String a = list.remove(idx);
            list.remove(idx);
            String b = list.remove(idx);

            list.add(idx, String.valueOf(Integer.parseInt(a) - Integer.parseInt(b)));

        }

        System.out.println(list.remove(0));
    }

}
