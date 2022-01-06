package step07_String.Q1157;

import java.util.Scanner;

public class Answer1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String engWord = sc.nextLine();

		char[] units = new char[engWord.length()];
		for (int i=0; i<engWord.length(); i++) {
			if (engWord.charAt(i)>=97) {
				units[i] = (char)(engWord.charAt(i)-32);
			} else {
				units[i] = engWord.charAt(i);
			}
		}

		char[] alphabets = new char[26];
		int[] unitsCount = new int[26];
		int idxOfTopCount = 0;
		int TopCount= 0;
		
		for (int i=0; i<26; i++) {
			alphabets[i] = (char)(65+i);
			for (int j=0; j<units.length; j++) {
				if (alphabets[i] == units[j]) {
					unitsCount[i] ++;
				}
			}
			
			if (TopCount < unitsCount[i]) {
				TopCount = unitsCount[i];
				idxOfTopCount = i;
			} 
		}
		
		for (int i=0; i<unitsCount.length; i++) {
			for (int j=0; j<unitsCount.length; j++) {
				if ((TopCount == unitsCount[i] && TopCount == unitsCount[j]) && i!=j) {
					System.out.println("?");
					return;
				} else if (i==unitsCount.length-1 && j==unitsCount.length-1) {
					System.out.println(alphabets[idxOfTopCount]);
				}
			}
		}
		
	}

}