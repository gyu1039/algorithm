package algorithm.programmers.codingtest;

public class TargetNumber {

    static int[] numbers;
    static int answer;
    static int target;

    public int solution(int[] num, int tar) {
        numbers = num;
        target = tar;

        dfs(0, -1);
        return answer;
    }

    public void dfs(int cur, int idx) {

        if(idx == numbers.length - 1 && cur == target) {
            answer++;
            return;
        }

        if(idx + 1 < numbers.length) {
            dfs(cur + numbers[idx+1], idx+1);
            dfs(cur + -numbers[idx+1], idx+1);
        }

    }
}
