package if문.Q2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		
		if (year%4==0) {
			if (year%100!=0) {
				System.out.println(1);
			} else if (year%400==0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			} 
		} else {
			System.out.println(0);
		}
		
	}
	
}