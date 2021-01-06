package step02_if.Q2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if (M>=45) {
			System.out.print(H+ " ");
			System.out.println(M-45);
		} else {
			if (H==0) {
				System.out.print(23 + " ");
				System.out.println(M+15);
			} else {
				System.out.print(H-1 + " ");
				System.out.println(M+15);
			}
		}
		
	}
	
}