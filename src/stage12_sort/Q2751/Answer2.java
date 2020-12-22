package stage12_sort.Q2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[2000001];
		
		for (int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine())+1000000] = true;
		}
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]) { 
				sb.append(i-1000000).append('\n');
			}
		}
		System.out.println(sb);
	}

}