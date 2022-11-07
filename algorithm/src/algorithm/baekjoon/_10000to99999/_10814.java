package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
			
		List<String> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			list.add(br.readLine());
		}
		
		
		Collections.sort(list, (String m1, String m2) -> {
			StringTokenizer st;
			st = new StringTokenizer(m1);
			int a1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(m2);
			int a2 = Integer.parseInt(st.nextToken());  
			return a1 > a2 ? 1 : a1 == a2 ? 0 : -1;
		});
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(String s : list) {
			bw.write(s + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void way2() throws NumberFormatException, IOException {
		
		 try (
	                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); ) {
	                    
	               
	            int T = Integer.parseInt(br.readLine());
	            StringBuilder[] ageSb = new StringBuilder[201];
	            for (int i = 0; i < 201; i++) {
	                ageSb[i] = new StringBuilder();
	            }
	            for (int i = 0; i < T; i++) {
	                StringTokenizer st = new StringTokenizer(br.readLine());
	                int age = Integer.parseInt(st.nextToken());
	                ageSb[age].append(age).append(" ").append(st.nextToken()).append("\n");
	            }
	            for (StringBuilder sb : ageSb) {
	                bw.write(sb.toString());
	            }
	        }
		 
	}
}
