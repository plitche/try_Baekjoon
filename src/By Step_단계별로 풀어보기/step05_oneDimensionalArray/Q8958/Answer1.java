package step05_oneDimensionalArray.Q8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i=0; i<testCase; i++) {
            String ox = br.readLine();
            int[] score = new int[ox.length()];
            int result = 0;

            if (ox.charAt(0)=='O') {
                score[0] = 1;
                result = 1;
            }
            for (int j=1; j<ox.length(); j++) {
                if (ox.charAt(j)=='O') {
                    score[j] = score[j-1]+1;
                    result+=score[j];
                }
            }
            bw.append(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

}
