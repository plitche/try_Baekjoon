package stage03_for문.Q2741;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i =0;
		while (i++ < N) {
			bw.append(String.valueOf(i));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
	
}