package step04_while.Q10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int A = 1;
		int B = 1;
		String str = "";
		
		while ((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str, " ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			sb.append(A+B);
			sb.append("\n");
		}
		System.out.println(sb);
		
	}

}
