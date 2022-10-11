package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class _1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());			
			int count = 0;
			int importance=9;
			int pos=0;
			int next=0;
			boolean find = false;			
			int[] arr = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			while(!find) {			
				pos = next;
				for(int j=0; j<N; j++) {			
					if(arr[(pos+j)%N] == importance) {
						count++;
						next = (pos+j)%N;
					}
					if((pos+j)%N == M && arr[(pos+j)%N] == importance) {
						find = true;
						break;
					}
				}
				importance--;
			}
			sb.append(count+"\n");			
		}		
		System.out.println(sb);
	}

	public static void way1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			List<Data> list = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				list.add(new Data(j, Integer.parseInt(st.nextToken())));
			}

			int index = 0;
			Data[] arr = new Data[N];
			while(list.size() != 0) {
				Data d = list.remove(0);
				boolean isPresent = list.stream().anyMatch((d1) -> {
					return d.importance < d1.importance;
				});
				
				if(isPresent) {
					list.add(d);
				} else {
					arr[index] = d;
					index++;
				}
			}
			
			for(int j=0; j<N; j++) {
				if(arr[j].index == M) {
					sb.append(j+1).append("\n");
				}
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	static class Data {
		
		int index;
		int importance;
		
		Data(int index, int importance) {
			this.index = index;
			this.importance = importance;
		}
		
		
		@Override
		public String toString() {
			return "[" + index + "]: [" + importance + "]"; 
		}
	}
}
