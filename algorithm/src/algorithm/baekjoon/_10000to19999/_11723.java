package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * bitmask로 구현해보세요!!
 * 
 */
public class _11723 {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int bitset = 0;
		
		StringBuilder sb = new StringBuilder();
		while(M-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String op = st.nextToken();
			int num;
			
			if(op.equals("add")) {
				num = Integer.parseInt(st.nextToken());
				bitset |= (1 << (num - 1));
				
			} else if(op.equals("remove")) {
				num = Integer.parseInt(st.nextToken());
				bitset = bitset & ~(1 << (num - 1));
			} else if(op.equals("check")) {
				num = Integer.parseInt(st.nextToken());
				sb.append((bitset & (1 << (num-1) )) != 0 ? "1\n" : "0\n");
			} else if(op.equals("toggle")) {
				num = Integer.parseInt(st.nextToken());
				bitset ^= (1 << (num-1));
			} else if(op.equals("all")) {
				bitset |= (~0);
			} else if(op.equals("empty")) {
				bitset &= 0;
			}
			
			
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
		
		
	}
	
	public static void way2() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int[] set = new int[21];
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			
			if(cmd.equals("add")) {
				int e = Integer.parseInt(st.nextToken());
				set[e] = 1;
				
			} else if(cmd.equals("check")) {
				int e = Integer.parseInt(st.nextToken());
				sb.append(set[e] == 1 ? 1 : 0).append("\n"); 
				
			} else if(cmd.equals("remove")) {
				int e = Integer.parseInt(st.nextToken());
				set[e] = 0;
				
			} else if(cmd.equals("toggle")) {
				int e = Integer.parseInt(st.nextToken());
				
				set[e] = set[e] == 1 ? 0 : 1;
				
			} else if(cmd.equals("all")) {
		
				Arrays.fill(set, 1);
				
			} else if(cmd.equals("empty")) {
				
				Arrays.fill(set, 0);
			}
			
			
		}
		
		System.out.println(sb);
	}
}
