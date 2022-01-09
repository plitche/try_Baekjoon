package step03_for.Q2739;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dan = br.readLine();
	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i=1; i<=9; i++) {
			bw.append(dan);
			bw.append(" * ");
			bw.append(String.valueOf(i));
			bw.append(" = ");
			bw.append(String.valueOf(Integer.parseInt(dan)*i));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
	}
	
}
