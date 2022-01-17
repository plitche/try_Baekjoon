package step07_String.Q2908;

import java.util.Scanner;

public class Answre1 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		
		String sangsusFirst = "";
		String sangsusSecond = "";
		
		for (int i=2; i>=0; i--) {
			sangsusFirst += first.charAt(i);
			sangsusSecond += second.charAt(i);
		}
		
		if (Integer.parseInt(sangsusFirst) >= Integer.parseInt(sangsusSecond)) System.out.println(sangsusFirst);
		else System.out.println(sangsusSecond);
		
		sc.close();

	}

}