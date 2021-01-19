package step06_function.Q1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int count=0;
		if (Integer.parseInt(N)<100) {
			System.out.println(N);
		} else {
			for (int i=100; i<=Integer.parseInt(N); i++) {
				if (String.valueOf(i).charAt(0)-String.valueOf(i).charAt(1)
					== String.valueOf(i).charAt(1)-String.valueOf(i).charAt(2)) {
					count++;
				}
			}
			System.out.println(99+count);
		}
	}
	
}