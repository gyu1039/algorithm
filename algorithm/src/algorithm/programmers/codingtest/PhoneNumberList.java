package algorithm.programmers.codingtest;

import java.util.Arrays;

public class PhoneNumberList {

    public boolean solution(String[] phoneBook) {

        Arrays.sort(phoneBook, (s1, s2) -> {
            return s1.compareTo(s2);
        });

        for(int i=0; i<phoneBook.length-1; i++) {
            String prefix = phoneBook[i];

            if(phoneBook[i+1].startsWith(prefix)) {
                return false;
            }
        }

        return true;
    }
}
