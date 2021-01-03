package step07_String.Q2675;

import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] r = new int[testCase];
        String[] s = new String[testCase];
        int[] idxOfUnit = new int[testCase];
        int[] idx = new int [testCase];

        for (int i=0; i<testCase; i++) {
            r[i] = sc.nextInt();
            s[i] = sc.next();

            char[] unit = new char[s[i].length()*r[i]];

            while (true) {
                if (idx[i]>=s[i].length() || idxOfUnit[i] >=s[i].length()*r[i]) {
                    break;
                }

                if (idxOfUnit[i]%r[i]!=0 || idxOfUnit[i]==0) {
                    unit[idxOfUnit[i]] = s[i].charAt(idx[i]);
                    idxOfUnit[i]++;
                } else {
                    idx[i]++;
                    unit[idxOfUnit[i]] = s[i].charAt(idx[i]);
                    idxOfUnit[i]++;
                }
                System.out.print(unit[idxOfUnit[i]-1]);
            }
            System.out.println();
        }

    }
}