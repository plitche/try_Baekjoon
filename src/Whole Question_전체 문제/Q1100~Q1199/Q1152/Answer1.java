package step07_String.Q1152;

import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		int spaceCount=0;

		for (int i=0; i<sentence.length(); i++ ) {
			if (sentence.charAt(i)==(char)32) {
				spaceCount++;
			}
		}
		
		if (sentence.charAt(0)==(char)32 && sentence.charAt(sentence.length()-1) == (char)32) {
			System.out.println(spaceCount-1);
		} else if (sentence.charAt(0)==(char)32 || sentence.charAt(sentence.length()-1) == (char)32) {
			System.out.println(spaceCount);
		} else {
			System.out.println(spaceCount+1);
		}
	}

}