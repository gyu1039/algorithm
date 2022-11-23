package algorithm.programmers.codingtest;

public class CalculateTheMissingAmount {

	public long solution(long price, int money, int count) {
        long answer = 0;

        for(int i=1; i<=count; i++) {
            answer += price * i;
        }
        
        answer = money - answer;
        return answer < 0 ? -answer : 0;
    }
}
