package step05_oneDimensionalArray.Q2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max=0;
		int a = 0;
		for (int i=0; i<9; i++) {
			int number = Integer.parseInt(br.readLine()); 
			if (max < number) {
				max = number;
				a = i+1;
			}
			
		}
		System.out.println(max);
		System.out.println(a);
	}

}
