package step05_array01.Q1546;

import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] subject;
		subject = new int[sc.nextInt()];
		
		int topScore=0;
		for (int i=0; i<subject.length; i++) {
			subject[i] = sc.nextInt();
			if(topScore < subject[i]) {
				topScore = subject[i];
			}
		}
		
		double sum=0;
		double[] subject2 = new double[subject.length];
		
		for (int i=0; i<subject.length; i++) {
			subject2[i] = (double)subject[i]/topScore*100;
			sum += subject2[i];
		}
		System.out.println((double)sum/subject.length);
	}

}