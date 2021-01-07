package step05_oneDimensionalArray.Q2577;

import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int multiple = A*B*C;
		char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int[] count = new int[10];
		
		for (int i=0; i<9; i++) {
			for (int j=0; j<array.length; j++) {
				if (String.valueOf(multiple).length()>i) {
					if (String.valueOf(multiple).charAt(i) == array[j]) {
						count[j] += 1;
					}
				}
			}
		}
		
		for (int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
		
		sc.close();
		
	}

}