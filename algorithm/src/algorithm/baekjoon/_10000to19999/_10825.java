package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _10825 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Student> pq = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			pq.add(new Student(name, kor, eng, math));
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			Student s = pq.poll();
			sb.append(s.name).append("\n");
		}
		
		
		System.out.println(sb);
	}
	
	static class Student implements Comparable<Student>{
		
		String name;
		int kor;
		int eng;
		int math;
		
		Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}

		@Override
		public int compareTo(Student another) {
			
			if(this.kor < another.kor) {
				return 1;
			} else if(this.kor == another.kor && this.eng > another.eng) {
				return 1;
			} else if(this.kor == another.kor && this.eng == another.eng && this.math < another.math) {
				return 1;
			} else if(this.kor == another.kor 
					&& this.eng == another.eng
						&& this.math == another.math) {
				
				return this.name.compareTo(another.name);
			} 
			
			return -1;
			
		}
	}
}


