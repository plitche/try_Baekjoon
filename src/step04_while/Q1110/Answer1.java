package step04_while.Q1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		
		int copy = A;
		int count = 0;
		
		do {
			A = ((A%10)*10)+(((A/10)+(A%10))%10);
			count++;
		} while(A != copy);
		
		System.out.println(count);
		
	}

}