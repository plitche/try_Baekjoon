package stage03_for문.Q2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan = Integer.parseInt(br.readLine());
	
		for (int i=1; i<=9; i++) {
			System.out.print(dan);
			System.out.print(" * ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(dan*i);
		}
		
	}
	
}