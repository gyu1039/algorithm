package algorithm.programmers.codingtest;

public class TruncateN2Array {

    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];

        long idx = left;
        for(int i=0; i<=right-left; i++) {
            int row = (int)(idx/n);
            int col = (int)(idx%n);

            answer[i] = Math.max(row, col) + 1;

            idx++;
        }
        return answer;
    }
}
