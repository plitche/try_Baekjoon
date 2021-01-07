package step07_String.Q10809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Answer1 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();

		for (int i=0; i<26; i++ ) {
			bw.append(String.valueOf(s.indexOf((char)(97+i)))+" ");
		}
		bw.flush();
		bw.close();
		
	}

}