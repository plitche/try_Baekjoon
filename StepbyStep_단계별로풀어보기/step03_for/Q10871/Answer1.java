package step03_for.Q10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(str1, " ");
		int N = Integer.parseInt(st1.nextToken());
		int X = Integer.parseInt(st1.nextToken());
		
		String str2 = br.readLine();
		StringTokenizer st2 = new StringTokenizer(str2, " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		for (int i=0; i<N; i++) {
			int number = Integer.parseInt(st2.nextToken());
			
			if (number < X) {
				bw.append(String.valueOf(number));
				bw.append(" ");
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
