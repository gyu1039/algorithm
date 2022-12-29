package algorithm.programmers.codingtest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DualPriorityQueue {

    public int[] solution(String[] operations) {


        List<Integer> list = new LinkedList<>();

        for (String s : operations) {
            String[] ar = s.split(" ");

            if (ar[0].equals("I")) {
                list.add(Integer.parseInt(ar[1]));
                continue;
            }


            Collections.sort(list);
            if (list.isEmpty()) {
                continue;
            }

            if (ar[1].equals("1")) {
                list.remove(list.size() - 1);
            } else {
                list.remove(0);
            }
        }

        Collections.sort(list);

        return list.size() == 0 ? new int[]{0, 0} :
                new int[]{list.get(list.size() - 1), list.get(0)};
    }
}
