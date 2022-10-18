package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class _1924 {
	
	public void way1() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		LocalDate date = LocalDate.of(2007, x, y);
		
		System.out.println(week[date.getDayOfWeek().getValue()-1]);
	}
	
	public void way2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day = 0;
		
		for(int i=0; i < x-1; i++) {
			day += months[i];
		}
		
		day += y;
		
		System.out.println(week[day%7]);
	}

	public static void main(String[] args) throws IOException {
		
		
	}

}
