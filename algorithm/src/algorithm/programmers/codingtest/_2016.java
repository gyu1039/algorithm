package algorithm.programmers.codingtest;

import java.time.LocalDate;

public class _2016 {

	public String solution(int a, int b) {
		
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
}
