package step07_String.Q11720;

import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		String a=sc.nextLine();
		
		int sum = 0;
		for (int i=0; i<a.length(); i++) {
			sum += (int)(a.charAt(i)-'0');
			
		}

		System.out.println(sum);
		
	}

}