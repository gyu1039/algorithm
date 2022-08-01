package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TheLawOfLargeNumbers {
	
	BufferedReader br;
	String[] first, second;
	int len, M, K;
	int[] a;
	int result = 0;
	
	public void init() throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		first = br.readLine().split(" ");
		second = br.readLine().split(" ");
		
		len = Integer.parseInt(first[0]);
		M = Integer.parseInt(first[1]);
		K = Integer.parseInt(first[2]);
		
		a = new int[len];
		
		for(int i=0; i<len; i++) {
			a[i] = Integer.parseInt(second[i]);
		}
	}

	public int solution1() throws IOException {
		
		Arrays.sort(a);

		int j=0;
		for(int i=0; i<M; i++) {
			if(j<K) {
				result += a[len-1];
				j++;
				continue;
			}
			
			result += a[len-2];
			j = 0;
		}
		
		return result;
	}
	
	public int solution2() {
		
		int count = (M / (K + 1)) * K + (M % (K + 1));
		
		result = count * a[len - 1];
		result += (M - K) * a[len - 2];
		
		
		return result;
	}
}
