package step05_array01.Q3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[42];
		int[] b = new int[10];
		for (int i=0; i<10; i++) {
			b[i] = Integer.parseInt(br.readLine())%42; 
		}
		
		int count=0;
		for (int i=0; i<42; i++) {
			for (int j=0; j<10; j++) {
				if (i==b[j]) {
					a[i] += 1;
				}
			}
			if (a[i]!=0) {
				count++;
			}

		}
		System.out.println(count);
	}

}