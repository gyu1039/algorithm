package algorithm.programmers.codingtest;

import java.util.ArrayDeque;
import java.util.Deque;

public class Printer {

    public int solution(int[] priorities, int location) {

        int answer = 1;

        Deque<Element> device = new ArrayDeque<>();


        for (int i = 0; i < priorities.length; i++) {
            device.addLast(new Element(i, priorities[i]));
        }


        for (int i = 0; i < priorities.length; i++) {

            int max = device.peekFirst().value;
            int idx = device.peekFirst().idx;

            for (Element e : device) {
                if (e.value > max) {
                    max = e.value;
                    idx = e.idx;
                }
            }

            while (device.peekFirst().idx != idx) {
                device.addLast(device.pollFirst());
            }

            Element printed = device.pollFirst();
            if (printed.idx == location) {
                break;
            }

            answer++;

        }

        return answer;
    }

    static class Element {

        int idx;
        int value;

        Element(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }
}
