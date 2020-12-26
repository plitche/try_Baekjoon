package step03_for.Q11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Answer1 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i=0; i<testCase; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.append("Case #" + String.valueOf(i+1) + ": ");
            bw.append(String.valueOf(A) + " + " + String.valueOf(B) + " = ");
            bw.append(String.valueOf(A+B));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

}