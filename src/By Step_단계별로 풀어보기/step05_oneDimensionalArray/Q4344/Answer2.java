package step05_oneDimensionalArray.Q4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());


        for (int i=0; i<testCase; i++) {
            String grade = br.readLine();
            StringTokenizer st = new StringTokenizer(grade, " ");
            int people = Integer.parseInt(st.nextToken());
            int[] score = new int[people];

            double total = 0;

            for (int j=0; j<people; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                total += score[j];
            }

            double avg = total/people;
            int okStudent = 0;

            for(int j=0; j<people; j++) {
                if(score[j] > avg) {
                    okStudent++;
                }
            }

            bw.write(String.format("%.3f", okStudent*100.000/people)+"%\n");	;
        }
        bw.flush();
        bw.close();
    }

}