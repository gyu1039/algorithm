package algorithm.programmers.codingtest;

public class SmallSubstring {

    public int solution(String t, String p) {
        int answer = 0;

        int lenOfP = p.length();

        for(int i=0; i<= t.length()-lenOfP; i++) {
            String s = t.substring(i, i+lenOfP);

            if(s.compareTo(p) <= 0) {
                answer++;
            }
        }

        return answer;
    }
}
